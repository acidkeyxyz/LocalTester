package com.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TopToys {
	
	//10:41 -11:24
	//given list of toys, get N tops ordered by number of matches and  alphabetically in case of match
	public static void main(String[] args) {
		String [] toys = {"woody","shrek","marshall","pitufos","barbies"};
		String [] reviews = {
				"woody is the best toy ever ",
				"woody is my favorite toy",
				"marshall from paw patrol is the best",
				"my marshall is the best, not pitufos",
				"barbies for girls is the best ever"};
		int tops = 2;
		List<String> listTops = getAllTopToys(toys,tops,reviews);
		print(listTops);
	}

	private static List<String> getAllTopToys(String[] toys, int tops, String[] reviews) {
		SortedMap<String,Integer> map = new TreeMap<String,Integer>();
		for(String item:toys) {
			map.put(item,0);
		}
		for(String review:reviews) {
			String []sreview = review.split(" ");
			for(String word:sreview) {
				if(map.containsKey(word)) {
					map.put(word,map.get(word)+1);
				}
			}
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new ValueThenKeyComparator<String, Integer>());
		List<String> results = new ArrayList<String> ();  
		for (int i = 0; i < tops; i++) {
			results.add(list.get(i).getKey());
		}
		return results;
	}

	private static void print(List<String> listTops) {
		for (String  item: listTops) {
			System.out.print(item+",");
		}
	}

	
}
