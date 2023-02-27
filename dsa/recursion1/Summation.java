package com.recursion1;

public class Summation {
	public static int summation(int n) {
		if(n == 1) {
			return 1;
		}
		return n+summation(n-1);
	}
	public static void main(String arg[]) {
		System.out.println(summation(5));
	}
}
