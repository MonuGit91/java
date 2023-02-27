/*
 * 2.  Write the code to find the Fibonacci series upto the nth term.
 * 		(where 0th no. = 0 and 1st no = 1)
 */

package interviewQ;

import java.util.Scanner;

public class Q02_fibonacci {
	public static Scanner scan = new Scanner(System.in);
	
	public static int fibonacci(int zeroth, int first, int nth) {
		if(nth == 0 || nth == 1) {
			return (nth == 0) ? zeroth : first;
		}
		
		int ith = 0;
		for(int i = 2; i <= nth; i++) {
			ith = (zeroth + first);
			zeroth = first;
			first = ith;
		}
		
		return ith;
		
	}
	public static int fibonacci1(int zeroth, int first, int nth) {
		if(nth == 0 || nth == 1) {
			return nth == 0 ? zeroth : first;
		}
		
		return  fibonacci1(zeroth, first, nth-1) + fibonacci1(zeroth, first, nth-2);
	}
	
	public static int fibonacciDp(int zeroth, int first, int nth, int dp[]) {
		if(nth == 0 || nth == 1) {
			dp[nth] =  (nth == 0) ? zeroth : first;
			return dp[nth];
		}
		
		if(dp[nth] != -1) {
			return dp[nth];
		}
		
		dp[nth] =  fibonacciDp(zeroth, first, nth-1, dp) + fibonacciDp(zeroth, first, nth-2, dp);
		return dp[nth]; 
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Enter zeroth and first fibonacci no: ");
		int zeroth = 0;//scan.nextInt();
		int first = 1;//scan.nextInt();
		
//		System.out.print("Which fibonacci no do you wand: ");
		int nth = 8;//scan.nextInt();
		
		System.out.print(nth + " fibonacci no is:\n");
		
		System.out.println(fibonacci(zeroth, first, nth));
		
		System.out.println(fibonacci1(zeroth, first, nth));
		
		int dp[] = new int[nth+1];
		for(int i = 0; i <= nth; i++) {
			dp[i] = -1;
		}
		System.out.println(fibonacciDp(zeroth, first, nth, dp));
		
//		
	}

}
/*
0 1
6
*/