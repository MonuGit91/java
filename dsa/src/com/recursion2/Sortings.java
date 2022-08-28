
package com.recursion2;

import java.util.Scanner;

//Sortings class
public class Sortings {
	public static Scanner scan = new Scanner(System.in);
	
//print Array
	public static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

//Swap 
	public static void swap(int arr[], int i, int j) {
		if(arr[i] == arr[j]) return;
		
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
//merge sorted array--------------------------------------------------------
	public static void merge(int arr[], int arrL[], int arrR[]) {
		int i = 0, j = 0, k = 0;
		
		while(i < arrL.length && j < arrR.length) {
			if(arrL[i] < arrR[j]) {
				arr[k++] = arrL[i++];
			}
			else {
				arr[k++] = arrR[j++];
			}
		}
		while(i < arrL.length) {
			arr[k++] = arrL[i++];
		}
		while(j < arrR.length) {
			arr[k++] = arrR[j++];
		}
	}
//Merge Sort
	public static void mergeSort(int arr[]) {
		if(arr.length == 1) return;
		
		int mid = arr.length/2;
		int[] arrL = new int[mid];
		int[] arrR = new int[arr.length-mid];
		
		for(int i = 0; i < mid; i++) {
			arrL[i] = arr[i];
		}
		for(int i = 0; i < arr.length-mid; i++) {
			arrR[i] = arr[mid+i];
		}
		
		mergeSort(arrL);
		mergeSort(arrR);
		merge(arr, arrL, arrR);		
	}
	
//bubble Sort Helper--------------------------------------------------------
	public static void bubbleSortHelper(int arr[], int count) {
		if(count == arr.length) return;
		
		for(int i = 0; i < arr.length-count; i++) {
			if(arr[i] > arr[i+1]) {
				arr[i] = arr[i] ^ arr[i+1];
				arr[i+1] = arr[i] ^ arr[i+1];
				arr[i] = arr[i] ^ arr[i+1];
			}
		}
		bubbleSortHelper(arr, count+1);
	}
	
//bubble Sort
	public static void bubbleSort(int arr[]) {
		bubbleSortHelper(arr, 1);
		print(arr);
	}	

//break Point(QuickSorthelper)-----------------------------------------------------------
	public static int breakPoint(int arr[], int start, int end) {
		int pivot = start;
		for(int i = start+1; i <= end; i++) {
			if(arr[i] < arr[start]) {
				pivot++;
			}
		}		
		swap(arr, start, pivot);
		
		int i = start, j = end;
		while(i < j) {
			if(arr[i] < arr[pivot]) {
				i++;
			}
			else {
				if(arr[j] >= arr[pivot]) {
					j--;
				}
				else {
					swap(arr, i, j);
					i++;
					j--;
				}
			}
			
		}
		return pivot;
	}
	
//QuickSorthelper
	public static void QuickSorthelper(int arr[], int start, int end) {
		if(start >= end) return;
		
		//finding pivot index and making all elements before pivot is smaller and after pivot bigger
		int pivot = breakPoint(arr, start, end);//pivot index will be correct index of arr[start]
				
		QuickSorthelper(arr, start, pivot-1);
		QuickSorthelper(arr, pivot+1, end);
		
	}
//Quick short
	public static void quickSort(int arr[]) {
		QuickSorthelper(arr, 0, arr.length-1);
		print(arr);
	}
	
//Main function----------------------------------------------------------------------
	public static void main(String arg[]) {
		int n = 10;
		int arr[] = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		print(arr);
		
//		swap(arr, 0, 8);
//		int n = scan.nextInt();
//		int arr[] = new int[n];
//		for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
		
//		Sortings.bubbleSort(arr);
//		mergeSort(arr);
		quickSort(arr);
	}
}

/*
9
9 8 7 6 5 4 3 2 1
*/
/*
 
*/















