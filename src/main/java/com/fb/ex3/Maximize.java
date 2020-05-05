package com.fb.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maximize {
  public static int maxArea(int[] arr) {
	  List<Integer> areas = new ArrayList<>();
	  int maxAltura = 0;
	  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	  
	  for (int i = 0; i < arr.length; i++) {
		  System.out.println("arr["+i+"]="+arr[i]);
		if (maxAltura < arr[i]) {
			if(map.get(arr[i])!=null) {
				System.out.println("increasing :"+arr[i]);
				map.put(arr[i],map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
			map = incrementAll(map,arr[i]);
			maxAltura = arr[i];
		}else if(maxAltura > arr[i]) {
			map = cutAll(areas,map,maxAltura,arr[i]);
			maxAltura = arr[i];
			map.put(arr[i], 1);
		}else {
			if(map.get(arr[i])!=null) {
				map.put(arr[i],map.get(arr[i])+1);
				System.out.println("increasing :"+arr[i]);
			}
		}
	} 
	  
	  return getMax(areas);
  }
  
  private static Map<Integer, Integer> cutAll(List<Integer> areas, Map<Integer, Integer> map, int maxAltura, int current) {
	for (int j = maxAltura; j > current; j++) {
		if(map.isEmpty()) {
			break;
		}
		if(map.get(j)!=null) {
			areas.add(j*map.get(j));
			System.out.println("new area saved ::"+(j*map.get(j)));
			map.remove(j);
		}
	}
	return map;
}

private static Map<Integer, Integer> incrementAll(Map<Integer, Integer> map,int maxAltura) {
	  if(map.isEmpty()) {
		  return map;
	  }
	for (int j =maxAltura; j>0; j--) {
		if(map.get(j)!=null) {
			System.out.println("increasing ["+j+"] :"+map.get(j));
			map.put(j,map.get(j)+1);
		}
		
	}
	return map;
}

private static int getMax(List<Integer> areas) {
	 if(areas.size() ==0) {
		 return 0;
	 }
	 Integer max = 0;
	 for(Integer item:areas) {
		 max = item> max ? item : max;
	 }
	return max;
}

public static void main(String[] args) {
	  int arr[] = { 4, 2, 0, 4, 6, 6, 2, 5 }; 
	System.out.println("the max area is "+maxArea(arr));
}
}
