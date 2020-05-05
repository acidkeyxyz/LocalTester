package com.fb.chido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Exam {
//	[
//	  [b@mail], -- A
//	  [e@mail, f@mail], -- C
//	  [f@mail, b@mail], -- D
//	]
	public static List<List<String>> matchEmails(List<List<String>> listoflist) {
		Map<String, List<String>> map = new HashMap<>();
		for (List<String> list : listoflist) {
			for (String item : list) {
				if (!map.containsKey(item)) {
					map.put(item,  list);
				} else {
					List<String> temp = map.get(item);
					temp.addAll(list);
				}
			}
		}
		Iterator<Entry<String, List<String>>> it = map.entrySet().iterator();
		List<List<String>> results = new ArrayList<>();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			//results.add(pair.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}
		return results;
	}

	public static void main(String[] args) {
		List<List<String>> listoflist = new ArrayList<List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("b@email");
		List<String> list2 = new ArrayList<String>();
		list2.add("e@email");
		list2.add("f@email");
		List<String> list3 = new ArrayList<String>();
		list3.add("f@email");
		list3.add("b@email");
		listoflist.add(list1);
		listoflist.add(list2);
		listoflist.add(list3);
		matchEmails(listoflist);
	}
}
