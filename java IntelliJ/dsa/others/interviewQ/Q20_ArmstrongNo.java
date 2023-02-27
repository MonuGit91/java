package dsa.others.interviewQ;


public class Q20_ArmstrongNo {
	public static int pow(int n, int p) {
		if(p == 0) {
			return 1;
		}
		
		return n*pow(n, p-1);
	}
	
	public static boolean isArmstrong(int n) {
		int sum = 0, temp = n;
		
		while(temp > 0) {
			int rem = temp % 10;
			temp /= 10;
			sum += (rem * rem * rem);
//			sum += pow(rem, 3);
		}
		
		return sum == n;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
		
	}
}