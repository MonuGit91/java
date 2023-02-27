package com.recursion1;

public class Fibonachii {
	public static int nthFibonachiiDPHelper(int n, int[] arr) {
		if(n == 0 || n == 1) {
	        arr[n] = n;
	        return n;
	    }
	    
	    if(arr[n] != -1) {
	        return arr[n];
	    }

	    return arr[n] = nthFibonachiiDPHelper(n-1, arr) + nthFibonachiiDPHelper(n-2, arr);
	}
	
	public static int fibonachiiDP() {
		 int n = 20;
		 int[] arr = new int[n+1];
		 for(int i = 0; i <= n; i++) arr[i] = -1;
		 return nthFibonachiiDPHelper(n, arr);
	}
	
	public static int fibonachii(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonachii(n-1) + fibonachii(n-2);
	}
	
	public static void main(String[] arg) {
//		System.out.print(fibonachii(40));
		System.out.print(fibonachiiDP());
	}
}
