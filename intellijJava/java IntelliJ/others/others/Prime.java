package others.others;


/*
Time complexity : O(sqrt(n))
space complexity : O(1)
*/

import fileInput.FileInput;

public class Prime extends FileInput {
	//		Scanner scan = new Scanner(System.in);
	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false; 
		}
		
		if(n == 2 || n == 3) {
			return true;
		}
		
		if(n%2 == 0 || n%3 == 0) {
			return false;
		}
		
		for(int i = 5; i <= Math.sqrt(n); i += 6) {
			if(n % i == 0 || (n % (i+2)) == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String [] arg) {
		fileInput();

		System.out.println("Yes for prime and No for non prime");
		for(int i = -5; i < 10000; i++) {
			System.out.print((i) + ": ");
			if(isPrime(i)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
	}
}
