package com.recursion2;

public class TawerOfHanoi {
	public static void tawerOfHanoi(int n, char source, char destination, char helper) {
		if(n == 1) {
			System.out.println(n + " " + source + " " + destination);
			return;
		}
		tawerOfHanoi(n-1, source, helper, destination);
		System.out.println(n + " " + source + " " + destination);
		tawerOfHanoi(n-1, helper, destination, source);
	}
	
	public static void main(String arg[]) {
		tawerOfHanoi(3, 'a', 'b', 'c');
	}
}
