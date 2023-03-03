package dsa.others.interviewQ;

public class Q04_Perfect {
	public static boolean isPerfect(int n) {
		if(n == 1) {
			return false;
		}
		
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		
		return sum == n;
		
	}
	public static boolean isPerfect1(int n) {
		int sum = 1;
		
		for(int i = 2; i*i <= n; i++) {//(i <= Math.sqrt(n))
			if(n % i == 0) {
				if(i*i != n) {
					sum += (i+(n/i));
				}
				else {
					sum += i;
				}
			}
		}
		
		if((sum == n) && sum != 1) return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 10000; i++) {
			if(isPerfect(i)) {
				System.out.print(i + " ");
			}
			if(isPerfect1(i)) {
				System.out.println(i);
			}
		}
	}

}
