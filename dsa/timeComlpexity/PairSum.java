package com.timeComlpexity;

import java.util.Arrays;

class Solution {
	
//Solution 1
	public static int pairSum1(int[] arr, int num) {
		//Your code goes here
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == num) count++;
            }
        }
        return count;
	}
//--------------------------------------------------------------------------
//Solution 2
	public static int pairSum2(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        
        int i = 0, j = arr.length-1;
        int pair = 0;
        while(i < j) {
            //sum is < num
            if(arr[i] + arr[j] < num) {
                i++;
                continue;
            }
            
            //sum is > num
            if(arr[i] + arr[j] > num) {
                j--;
                continue;
            }
            
            //sum == num and both elements are same ie, [i]+[j] == num and [i] == [j] like: 3 3 3; ans = 2(2+1)/2
            if(arr[i] == arr[j]) {
                int n = j - i;
                pair += (n*(n+1))/2;
                return pair;
            }
            
            //sum == num and both elements are different ie, [i]+[j] == num but [i] != [j]
            int left = 1, right = 1;
            while(i < j) {//eg, if ilke: 3 3 3 1 2 4 4 4 where num = 7
                if(arr[i] == arr[i+1]) {
                    left++;
                	i++;
                }
                if(arr[j] == arr[j-1]) {
                    right++;
                    j--;
                }
                if(arr[i] != arr[i+1] && arr[j] != arr[j-1]) {
                    i++; //*******
                    j--; //*******
                    break;
                }
            }
            
            pair += (left * right);
        }
        return pair;
	}

//----------------------------------------------------------------------------------------------
//Solution 3
	public static int pairSum3(int[] arr, int num) {
		//Your code goes here
	    int arr1[] = new int[10000];
	    for(int i = 0; i < arr.length; i++) {
	        arr1[arr[i]]++;//gives error when arr[i] == -ve
	    }
	    
	    int pair = 0;
	    
	    for(int i = 0; i < arr.length; i++) {
	        int rem = num - arr[i];
        
	        if(arr1[rem] != 0) {
	            if(rem == arr[i]) {//when elements are same like 3 3 3 3 3 apply formula of sum of n natural no
	                int n = arr1[arr[i]]-1;
	                pair += ((n*(n+1))/2);
	                arr1[arr[i]] = 0;
	                
	            }
	            else {//if 1 element present 2 time and another element present 4 time then 2*4 pairs can form
	                pair += (arr1[arr[i]]*arr1[rem]);
	            	arr1[arr[i]] = 0;
	            }
	            
	        }
	    }
	    return pair;
	}
/*
//c++ solution
 
#include <unordered_map>
int pairSum(int *arr, int size, int sum) {
	unordered_map<int, int> map;
	int pair = 0;
    
    //counting how many times each no is present
	for(int i = 0; i < size; i++) {
		map[arr[i]]++;
	}
	
    
	for(int i = 0; i < size; i++) {
		int remaning = sum - arr[i];
		
    	//if map contains remaning no as key then sum is exist
		if(map.count(remaning) != 0) {
			if(arr[i] == remaning) {//ie, like: [i] == 3 and remaning == 3 then no of pairs will be n(n+1)/2 where n = count of [i] or count of remaning
				int n = map[remaning]-1;
				pair += (n*(n+1))/2;

				map[remaning] = 0;
				continue;
			}

			pair += (map[arr[i]] * map[remaning]);//ie, [i] != remaning
			map[arr[i]] = 0;
			map[remaning] = 0;
		}
	}
	return pair;
}

*/
//------------------------------------------------------------------------------------------
}

public class PairSum {
	public static void main(String arg[]) {
		int arr[] = new int[]{0, 6, 0, 0, 0};
		System.out.println(Solution.pairSum1(arr, 6));
		System.out.println(Solution.pairSum2(arr, 6));
		System.out.println(Solution.pairSum3(arr, 6));
	}

}

