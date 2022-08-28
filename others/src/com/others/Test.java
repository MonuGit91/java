package com.others;

import java.util.*;
class Test {
	static Scanner scan = new Scanner(System.in);
	static int max = Integer.MIN_VALUE;
	public static int minimum(int n, int arr[]) {
		int q = scan.nextInt();
		
		int i = 1;
		for(i = 1; i < 1000000000; i++) {
			if(i * n < q) continue;
			if(i > max) break;
			
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(arr[j] >= i) {
					count += i;
				}
				else {
					count += arr[j];
				}
			}
			if(count >= q) {
				return i;
			}
			
		}
		return -1;
	}
	
    public static void main (String[] args) {
    	int  n = scan.nextInt();
    	
    	int arr[] = new int[n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = scan.nextInt();
    		if(max < arr[i]) {
				max = arr[i];
			}
    	}
    	
    	int q = scan.nextInt();
    	while(q-- > 0) {
    		int ans = minimum(n, arr);
    		System.out.println(ans);
    	}
	}
    
}