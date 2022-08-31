package InterviewQ;


public class Q19_ArmstrongNo {
	public static int pow(int num, int p) {
		if(p == 0) {
			return 1;
		}
		
		if(p % 2 == 0) {
			return pow(num, p/2) * pow(num, p/2);
		}
		else {
			return num * pow(num, p/2) * pow(num, p/2);
		}
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