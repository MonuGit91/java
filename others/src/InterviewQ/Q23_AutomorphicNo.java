package InterviewQ;

public class Q23_AutomorphicNo {
	public static boolean automorphic(int n) {
		int div = 1;
		int temp = n;

		while (temp > 0) {
			temp /= 10;
			div *= 10;
		}

		int sqr = n * n;
		return (sqr % div) == n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(automorphic(0));
	}

}
