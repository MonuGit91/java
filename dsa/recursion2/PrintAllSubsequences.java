package com.recursion2;



public class PrintAllSubsequences {
//---------------------------------------------------------------------------------
	public static void printSubsequences(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		printSubsequences(str.substring(1), ans);
		printSubsequences(str.substring(1), ans + str.charAt(0));
	}
	public static void allSubsequences(String str) {
		printSubsequences(str, "");
	}
//--------------------------------------------------------------------------------
	public static void main(String arg[]) {
		String s[] = new String[]{"aaa"};
		allSubsequences("abc");
	}
}
