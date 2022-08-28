package InterviewQ;

public class Q13_ReplaceSubstring {
	
	public static boolean mach(String str, String s1, int ind) {
		for(int i = 0; i < s1.length() ; i++) {
			if(ind+i >= str.length() || str.charAt(ind+i) != s1.charAt(i)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void replaceSubstring(String str, String s1, String s2) {
		String ans = "";
		for(int i = 0; i < str.length(); i++) {
			if(mach(str, s1, i)) {
				ans += s2;
				i += (s1.length()-1);
			}
			else {
				ans += str.charAt(i);
			}
		}
		System.out.println(ans);
	}
	public static void main(String arg[]) {
		replaceSubstring("abcdefabdeabc", "def", "A1111");
	}
}
