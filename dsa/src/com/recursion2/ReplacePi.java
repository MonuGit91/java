package com.recursion2;

public class ReplacePi {
	public static String replacePi(String str) {
		if(str.length() <= 1) return str;
		
		if(str.charAt(0) == 'p' && str.charAt(1) == 'i') return "3.14" + replacePi(str.substring(2));
		else return str.charAt(0) + replacePi(str.substring(1));
	}
	public static void main(String arg[]) {
		System.out.println(ReplacePi.replacePi("piaaaaappii"));
	}
}
//class Main {
//	public static void main(String arg[]) {
//		System.out.println(ReplacePi.replacePi("piaaaaappii"));
//	}
//}