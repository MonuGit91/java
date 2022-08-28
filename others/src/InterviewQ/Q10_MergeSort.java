package InterviewQ;

import java.util.*;

public class Q10_MergeSort {
	public static Scanner scan = new  Scanner(System.in);
	 
	public static void printArr(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void merge(int arr[], int arr1[], int arr2[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[k++] = arr1[i++];
			}
			else {
				arr[k++] = arr2[j++];
			}
		}
		
		while(i < arr1.length) {
			arr[k++] = arr1[i++];
		}
		
		while(j < arr2.length) {
			arr[k++] = arr1[j++];
		}
	}
	
	public static void mergeSort(int arr[]) {
		int n = arr.length;
		if(n <= 1) {
			return;
		}
		
		int mid = n/2;
		int length1 = mid;
		int length2 = (n % 2) == 0 ? mid : mid+1;//****
		
		int left[] = new int[length1];
		int right[] = new int[length2];
		
		
		int i = 0;
		for(i = 0; i < mid; i++) {
			left[i] = arr[i];
			right[i] = arr[mid+i];//****
		}
		
		right[right.length-1] = arr[n-1];//*****it is crucial if n is odd
										//it is always writh no matter n is even of odd

		mergeSort(left);
		mergeSort(right);
		
		merge(arr, left, right);
		
	}
	
	public static void main(String[] args) {
//		int n = scan.nextInt();
		int n = 11;
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
			arr[i] = n-i;
		}
		
		printArr(arr);
		
		mergeSort(arr);
		printArr(arr);
	}

}
