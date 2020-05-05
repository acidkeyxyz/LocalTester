package com.fb.ex5;

public class IntegerInverter {
	public static int invert(int input) {
		int result=0;
		for(int i=0;;i++) {
			int msv = input % 10;
			result+= msv;
			input /=10;
			if(input !=0) {
				result*=10;
			}
			else {
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int input = 12345;
		System.out.println(invert(input));
	}
}
