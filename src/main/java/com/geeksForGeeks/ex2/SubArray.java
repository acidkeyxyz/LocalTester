package com.geeksForGeeks.ex2;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
	/**
	 * Given an unsorted array A of size N of non-negative integers, find a
	 * continuous sub-array which adds to a given number S.
	 * print array if sum equals S, else print -1.
	 * 
	 * Example: 
		Input:
		12
		1 2 3 7 5
		Output:
		2 4
		
		Input:
		15
		1 2 3 4 5 6 7 8 9 10
		Output:
		1 5
	 */
	
	public static List<Integer> provideSubArray(int[] arr,int finalSum ) {
		List<Integer> list= new ArrayList<Integer>();
		int curSum = 0;
		int start= 0;
		int end=-1;
		int i=start;
		while(curSum!=finalSum) {
			if(i>=arr.length) {
				list.add(-1);
				return list;
			}else {
				curSum+=arr[i];
			}
			if(curSum < finalSum) {
				i++;
				continue;
			}else if(curSum == finalSum) {
				end=i;
				break;
			}else if(curSum > finalSum) {
				i=++start;
				curSum=0;
			}
		}
		list.add(start+1);
		list.add(end+1);
		return list;
 	}
	public static void main(String[] args) {
		int []arr1 = {1,2,3,7,5};
		System.out.println(provideSubArray(arr1, 12));
		int []arr2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(provideSubArray(arr2,15));
	}
}
