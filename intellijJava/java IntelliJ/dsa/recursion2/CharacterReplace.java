package dsa.recursion2;

public class CharacterReplace { 
	public static String characterReplace(String str, char a, char b) {
		if(str.length() == 0) return "";
		if(str.charAt(0) == 'm') {
			return b + characterReplace(str.substring(1), a, b);
		}
		return str.charAt(0) + characterReplace(str.substring(1), a, b);
	}
	public static String removeX(String str){
		if(str.length() == 0) return "";
		
		String smallAns = removeX(str.substring(1));
		if(str.charAt(0) == 'x') {
			return smallAns;
		}
		return str.charAt(0)+smallAns;
	}
	public static void main(String arg[]) {
		String s = new String();
		s = "Codimg Ninja " + "Recursiom";
		System.out.println(characterReplace(s, 'm', 'n'));
		
		System.out.println(removeX("xyxz"));
	}
}
