package dsa.others.interviewQ;

import java.util.*;


public class Q15_ReplaceByRank {
	public static Scanner scan = new Scanner(System.in);
	
	private static void print(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void rank1(int arr[]) {
		int ranked[] = new int[arr.length];
		
		//loop for each particular value
		for(int i = 0; i < arr.length; i++) {
			int val = arr[i];
			int count = 1;
			
			//for each particular value count values grater then the particular value
			for(int j = 0; j < arr.length; j++) {
				if(val > arr[j]) {
					count++;
				}
			}
			
			ranked[i] = count;
		}
		print(ranked);
		
	}
	
	private static void rank2(int arr[]) {
		int temp[] = new int[arr.length]; 
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		
		Arrays.sort(temp);
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < temp.length; i++) {
			if(max < temp[i]) {
				max = temp[i];
			}
		}
		
		int ranked[] = new int[max+1];
		for(int i = 0; i < temp.length; i++) {
			if(ranked[temp[i]] == 0) {
				ranked[temp[i]] = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = ranked[arr[i]]+1;
		}
		
		print(temp);
	}
	
	private static void rank3(int arr[]) {
		int temp[] = new int[arr.length]; 
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		
		Arrays.sort(temp);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < temp.length; i++) {
			if(!map.containsKey(temp[i])) {
				map.put(temp[i], i);
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = map.get(arr[i])+1;
		}
		
		print(temp);
	}
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		rank1(arr);
		rank2(arr);
		rank3(arr);
	}
	
	
	
	
}



/*
Input:
4
100 5 70 2 

Output: 
4 2 3 1 

*/
