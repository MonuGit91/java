package InterviewQ;

import java.util.*;

public class Q17_LongestPalindrome {	
	private static int checkPalindrom(int num) {
		// TODO Auto-generated method stub
		String str = "" + num;
		
		int i = 0, j = str.length()-1;
		while(i < j) {
			if(str.charAt(i++) != str.charAt(j--)) {
				return -1;
			}
		}
		
		return str.length();
	}
	
	public static void longestPalindrom(int arr[]) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, checkPalindrom(arr[i]));
		}
		
		System.out.print(max);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {12321, 121, 1234, 1234321};
		longestPalindrom(arr);
	}
}
