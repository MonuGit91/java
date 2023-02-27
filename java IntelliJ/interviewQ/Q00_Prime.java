package interviewQ;

import java.util.Scanner;

/*
Time complexity : O(sqrt(n))
space complexity : O(1)
*/

public class Q00_Prime {
	static Scanner scan = new Scanner(System.in);
	
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false; 
		}
		
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String [] arg) {
		
		for(int i = -5; i < 1000; i++) {
			System.out.println(i + "\n" + isPrime(i));			
		}
	}
}
