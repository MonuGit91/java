package dsa.others.others;

import java.io.*; //or
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;

public class StringAndInteger {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		int arr[] = {1, 2, 3, 4};
		int a = Integer.parseInt(br.readLine());
		String s = Integer.toString(arr[0]);
		
		int c = Integer.parseInt(s);
		int a1 = 0;
		int b = 0;
		
		System.out.println(a + " " + b);
		String s2 = "a";
		float a2 = 4444;
		s += a2;
		
		int c2 = Integer.parseInt("123");
		System.out.println(c2);
	}

}
