package com.geeksForGeeks.ex3;

import java.math.BigInteger; 

public class ConcatBin {
	/* given an integer n, you need to concat all numbers in binary and return the number
	 * for example:
	 * 		input :3
	 *   1 10 11 =16+8+0+2+1 = 27 
	**/
	
	public static BigInteger exec(long input) {
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=input;i++) {
			sb.append(Integer.toBinaryString(i));
		}
		System.out.println(sb.toString());
		//11011
		BigInteger count = BigInteger.ZERO;
		for(int i=0,j=sb.length()-1;j>=0;j--,i++) {
//			System.out.println(sb.charAt(i));
			if(sb.charAt(i)=='1') {
				BigInteger temp = BigInteger.valueOf((long)Math.pow(2,j));
				count = count.add(temp);
			}
			
		
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(ConcatBin.exec(54));
	}
}
