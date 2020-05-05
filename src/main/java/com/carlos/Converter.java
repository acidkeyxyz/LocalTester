package com.carlos;

public class Converter {
	public static String convert2dec(String binary) {
		String []splitted = binary.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String item : splitted) {
			sb.append(bin2dec(item)).append(" ");
		}
		return sb.toString();
	}
	
	private static String bin2dec(String item) {
		int converted = 0;
		if(item.length()!=0) {
			for(int i=1;i<=item.length();i++) {
				char digit = item.charAt(item.length()-i);
				if(digit == '1') {
					converted += Math.pow(2, (i-1));
				}
					
			}
			
		}
		return String.valueOf(converted);
	}
	
	public static void main(String[] args) {
		String converted = Converter.convert2dec("00111 11111 010101 11111 11000 11110 00011 11100 110011 / 01111 11111 11111 010101 00011 10000 10000 00111 11100 10000 01010");
		Converter.convert2ascii("7 31 21 31 24 30 3 28 51 0 15 31 31 21 3 16 16 7 28 16 10");
		System.out.println(converted);
	}

	private static void convert2ascii(String string) {
		String [] sline = string.split(" ");
		for(String item:sline) {
			System.out.printf("%c",Integer.valueOf(item));
		}
	}
}
