package InterviewQ;

public class Q06_Palindrome {
	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length()-1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		
		while(temp != 0) {
			rev = (rev*10) + (temp%10);
			temp /= 10;
		}
		
		
		return rev == n;
	}
	
	public static void main(String[] args) {
		boolean flag1 = isPalindrome("1114111");
		System.out.println(flag1);
		
		boolean flag2 = isPalindrome(12621);
		System.out.println(flag2);
	}
}
