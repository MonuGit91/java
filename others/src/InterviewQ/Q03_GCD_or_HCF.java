package InterviewQ;
import java.util.*;
public class Q03_GCD_or_HCF {
	/*
	 * Time Complexity: O(log(min(a,b))
	 * Auxiliary Space: O(1))
	 */
	public static int gcd(int a, int b) {
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
	
	public static void main(String arg[]) {
		System.out.print(gcd(0, 13));
	}
}
