package com.recursion1;
import java.util.Scanner;

public class ArrSortedOrNot {
	public static Scanner scan = new Scanner(System.in);
	
	private static boolean help(int[] arr, int n) {
		if(n <= 1) return true;
		if(arr[n-1] < arr[n-2]) return false;
		
		return help(arr, n-1);
	}
	
	public static boolean isSorted(int[] arr) {
		return help(arr, arr.length);
	}
	
	public static void main(String[] agr) {
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
		
		System.out.print(isSorted(arr));
	}
}
