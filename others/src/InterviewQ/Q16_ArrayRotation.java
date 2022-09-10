package InterviewQ;

import java.util.*;

public class Q16_ArrayRotation {
	public static Scanner scan = new Scanner(System.in);
	
	public static void reverse1(int arr[], int k) {
		k %= arr.length;
		
		int temp[] = new int[arr.length];
		
		int j = arr.length - k;
		for(int i = 0; i < k; i++) {
			temp[j++] = arr[i];
		}
		
		j = 0;
		for(int i = k; i < arr.length; i++) {
			temp[j++] = arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
	}
	
	//---------------------------------------------------------------
	public static void swap(int arr[], int i, int j) {
		if(i == j) {
			return;
		}
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	public static void reverseHelp(int arr[], int i, int j) {
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void reverse2(int arr[], int k) { 
		k %= arr.length;
		
		int i = 0, j = k-1;
		
		reverseHelp(arr, i, j);
		
		i = k;
		j = arr.length-1;
		reverseHelp(arr, i, j);
		
		i = 0;
		j = arr.length-1;
		reverseHelp(arr, i, j);
	}
	
	private static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//-----------------------------------------------------------------
	public static void main(String[] args) {
		int n = 10;
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		
		int k = 3;
		reverse1(arr, k);
//		reverse2(arr, k);
		
		print(arr);
	}
}
