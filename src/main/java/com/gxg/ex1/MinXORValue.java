package com.gxg.ex1;



public class MinXORValue {
/**
 * https://www.geeksforgeeks.org/find-the-minimum-value-of-the-given-expression-over-all-pairs-of-the-array/
 * Input:  A = [1, 2, 3, 4, 5]
Output:  1
Explanation: 
(A[1] and A[2]) xor (A[1] or A[2]) = 1,
(010 & 011) xor (010 | 011) = (010) xor (011) = 001 

which is minimum possible value.

Input : A = [12, 3, 14, 5, 9, 8]
Output : 1
 */
	public static int solve(int []arr){
		int minVal = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i!=j) {
					minVal = Integer.min(calculate(arr[i],arr[j]), minVal);
				}
			}
		}
		return minVal;
	}
	
	private static int calculate(int ai, int aj) { 
	return (ai & aj) ^ (ai | aj) ;
}

	public static void main(String[] args) {
		//int []arr = {1, 2, 3, 4, 5};
		int []arr = {12, 3, 14, 5, 9, 8};
		System.out.println(solve(arr));
	}
}
