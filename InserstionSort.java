package com.SortingAlgorithms;

public class InserstionSort {
	public static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void sort(int arr[], int n) {
		if(n <= 1) {
			return;
		}
		
		sort(arr, n-1);
		
		int last = arr[n-1];
		int i = n-2;
		
		while(i >= 0 && arr[i] > last) {
			arr[i+1] = arr[i];
			i--;
		}
		
		arr[i+1] = last;
	}
	
	public static void sort1(int arr[]) {
		for(int i = 1; i < arr.length; i++) {
			int last = arr[i];
			int j = i-1;
			
			while(j >= 0 && last < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = last;
		}
	}
	
	public static void main(String arg[]) {
		int arr[] = {8, 4, 2, 9, 7, 6, 5, 1, 3, 0};
		print(arr);
		
//		sort(arr, 10);
//		print(arr);
		
		sort1(arr);
		print(arr);
	}
}
