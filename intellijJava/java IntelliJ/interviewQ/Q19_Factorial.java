package interviewQ;

public class Q19_Factorial {
	public static int factorial(int n) {
		if(n <= 1) {
			return n;
		}
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(factorial(i));
		}
		
	}

}
