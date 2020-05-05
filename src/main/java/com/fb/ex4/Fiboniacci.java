package com.fb.ex4;

public class Fiboniacci {
	 
	public static long makeFib(int number) {
		long []fibs  = new long[number+1];
		fibs[0]=fibs[1]=1;
		return fib(number,fibs);
	}
	private static long fib(int number, long[] fibs) {
		if(fibs[number]!=0) {
			System.out.println("ahorro :: fib["+number+"]="+fibs[number]);
			return fibs[number];
		}else if(number == 0 ||number == 1) {
			fibs[number]=1;
			return 1;
		}
		fibs[number]=fib(number-1,fibs)+fib(number-2,fibs);
		return fibs[number];
	}
	public static void main(String[] args) {
		int number =100;
		System.out.println("fib("+number+") = "+makeFib(number));
	}
}
