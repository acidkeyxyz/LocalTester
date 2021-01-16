package com.fb.ex6;

public class MarkeeMaker {
	public static void main(String[] args) {
		String msg ="72,97,112,112,121,32,98,105,114,116,104,100,97,121,32,67,108,97,117,33,";
		for(String c:msg.split(",")) {
			char n = (char)(Integer.parseInt(c)+3);
			System.out.print(n);
		}
	}
}