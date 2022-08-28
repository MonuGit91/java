/*
 * 2.  Write the code to find the Fibonacci series upto the nth term.
 * 		(where 0th no. = 0 and 1st no = 1)
 */

package InterviewQ;

import java.util.Scanner;

public class Q02_fibonacci {
	public static Scanner scan = new Scanner(System.in);
	
	public static int fibonacci(int zeroth, int first, int nth) {
		if(nth == 0 || nth == 1) {
			return (nth == 0) ? zeroth : first;
		}
		
		int ith = 0;
		for(int i = 2; i <= nth; i++) {
			ith = zeroth + first;
			zeroth = first;
			first = ith;
		}
		
		return ith;
		
	}
	
	public static int fibonacci(int nth) {
		//F(n) = round( Phi^n / √5 ) provided n ≥ 0
		//F(n) = round( (-phi)^n / √5 ) provided n < 0
		
		double phi = (Math.sqrt(5)+1)/2;
		return (int)Math.round(Math.pow(phi, nth) / Math.sqrt(5));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter zeroth and first fibonacci no: ");
		int zeroth = scan.nextInt();
		int first = scan.nextInt();
		
		System.out.print("Which fibonacci no do you wand: ");
		int nth = scan.nextInt();
		
		System.out.print(nth + " fibonacci no is: ");
		System.out.println((fibonacci(zeroth, first, nth)));
		
		System.out.print(nth + " fibonacci no is: ");
		System.out.println((fibonacci(nth)));
		
	}

}
