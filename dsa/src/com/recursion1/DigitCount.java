package com.recursion1;

public class DigitCount {
	public static int count(int n){
		if(n == 0) return 0;
        return 1 + count(n/10);
    }
	public static void main(String[] arg) {
		System.out.println(count(100));
	}
}
