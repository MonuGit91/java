package com.recursion1;

public class Factorial {
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		int smallAns = fact(n-1);
		return n*smallAns;
	}
	public static void main(String[] arg) {
		System.out.print(fact(5));
	}
}