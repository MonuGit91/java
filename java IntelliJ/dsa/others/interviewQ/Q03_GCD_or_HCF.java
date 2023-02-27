package dsa.others.interviewQ;
import java.util.*;
public class Q03_GCD_or_HCF {
	/*
	 * Time Complexity: O(log(min(a,b))
	 * Auxiliary Space: O(1))
	 */
	public static int gcd(int a, int b) {
		if(a== 0 || b == 0) {
			return 0;
		}
		int divisor = Math.min(a, b);
		int dividend = Math.max(a, b);
		int remainder = 0;
		
		while(divisor != 0) {
			remainder = dividend % divisor;
			dividend = divisor;
			divisor = remainder;
		}
		return dividend;
	}
	
	
	public static int helper(int dividend, int divisor) {
		if(divisor == 0) {
			return dividend;
		}

		int remainder = dividend % divisor;
		
		return  helper(divisor, remainder);
	}
	
	public static int gcd1(int a, int b) {
		if(a== 0 || b == 0) {
			return 0;
		}
		int divisor = Math.min(a, b);
		int dividend = Math.max(a, b);
		
		return helper(divisor, dividend);
	}
	
	public static void main(String arg[]) {
		System.out.println(gcd(20, 12));
		
		
		//using recursion
		System.out.println(gcd1(20, 12));
	}
}
