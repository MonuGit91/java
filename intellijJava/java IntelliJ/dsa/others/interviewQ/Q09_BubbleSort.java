package dsa.others.interviewQ;

import java.util.Iterator;
import java.util.Scanner;

public class Q09_BubbleSort {
	public static Scanner scan = new Scanner(System.in);
	
	public static void swap(int arr[], int i, int j) {
		if(arr[i] == arr[j]) {
			return;
		}
		
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for (int i = 0; i < n-1; i++) {
			boolean flag = true;
			
			for (int j = 0; j < n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					flag = false;
				}
			}
			
			if(flag) {
				break;
			}
		}
	}
	
	public static void bubbleSortRecursive(int arr[], int i) {
		if(i >= arr.length-1) {
			return;
		}
		
		for(int j = 0; j < arr.length-1; j++) {
			if(arr[j] > arr[j+1]) {
				swap(arr, j, j+1);
			}
		}
		
		bubbleSortRecursive(arr, i+1);
		
	}
	
	public static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		printArr(arr);
		
//		bubbleSort(arr);
		bubbleSortRecursive(arr, 0);
		
		printArr(arr);
	}

}

/*
10
10 9 8 7 6 5 4 3 2 1

1 2 3 4 5 6 7 8 9 10 
*/
