package interviewQ;

public class Q21_NaturalNoSum {
	public static int naturaNoSum(int n) {
		if(n == 0) {
			return -1;
		}
//		if(n == 1) {
//			return 1;
//		}
//		
//		return n + naturaNoSum(n-1);
		return (n * (n+1))/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(naturaNoSum(i));
		}
	}

}
