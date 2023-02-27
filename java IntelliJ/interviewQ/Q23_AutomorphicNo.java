package interviewQ;

public class Q23_AutomorphicNo {
	public static boolean isAutomorphic(int n) {
		int temp = n;
		int squar = n*n;

		while (temp > 0) {
			if(temp % 10 != squar % 10) {
				return false;
			}
			temp /= 10;
			squar /= 10;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAutomorphic(125));
	}

}
