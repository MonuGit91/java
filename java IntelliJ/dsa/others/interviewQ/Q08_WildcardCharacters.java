package dsa.others.interviewQ;

import java.util.*;

public class Q08_WildcardCharacters {
	public static Scanner scan = new Scanner(System.in);
	
	private static boolean helper(String pattern, String text, int i, int j) {
		if(i < 0 && j < 0) {
			return true;
		}
		if(i < 0 && j >= 0) {
			return false;
		}
		if(i >= 0 && j < 0) {
			for(int p = 0; p <= i; p++) {
				if(pattern.charAt(p) != '*') {
					return false;
				}
			}
			return true;
		}
		
		if(pattern.charAt(i) == text.charAt(j) || pattern.charAt(i) == '?') {
			return helper(pattern, text, i-1, j-1);
		}
		if(pattern.charAt(i) == '*') {
			return helper(pattern, text, i-1, j) | helper(pattern, text, i, j-1);
		}
		
		return false;
	}
	
	private static boolean helper(String pattern, String text, int i, int j, ArrayList<ArrayList<Boolean> > dp) {
		if(i < 0 && j < 0) {
			return true;
		}
		if(i < 0 && j >= 0) {
			return false;
		}
		if(i >= 0 && j < 0) {
			for(int p = 0; p <= i; p++) {
				if(pattern.charAt(p) != '*') {
					return false;
				}
			}
			return true;
		}
		if(dp.get(i).get(j) == true) {
			return true;
		}
		
		if(pattern.charAt(i) == text.charAt(j) || pattern.charAt(i) == '?') {
			boolean ans = helper(pattern, text, i-1, j-1, dp);
			dp.get(i).set(j, ans);
			return ans;
		}
		
		if(pattern.charAt(i) == '*') {
			boolean ans = helper(pattern, text, i-1, j) | helper(pattern, text, i, j-1, dp);
			dp.get(i).set(j, ans);
			return ans;
		}
		
		dp.get(i).set(j, false);
		return false;
	}
	
	private static boolean wildcardCharacters(String pattern, String text) {
		int n = pattern.length();
		int m = text.length();
//		return helper(pattern, text, n-1, m-1);
		
		ArrayList<ArrayList<Boolean> > dp = new ArrayList<ArrayList<Boolean> >();
		
		for(int i = 0; i < n; i++) {
			dp.add(new ArrayList<Boolean>());
			for(int j = 0; j < m; j++) {
				dp.get(i).add(false);
			}
		}
		
		return helper(pattern, text, n-1, m-1, dp);
	}

	public static void main(String[] args) {
		String text = scan.nextLine();
		String pattern = scan.nextLine();
		
		System.out.println(wildcardCharacters(pattern, text));
		
	}

}

/*
baaabab
*****ba*****ab
true


baaabab
baaa?ab
true


baaabab
ba*a?
true

baaabab
a*ab
false
 */