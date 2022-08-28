/*
 * Write a code to reverse a number
 * be careful in case of -ve no. for String
 */

package InterviewQ;

import java.util.Scanner;

public class Q01_ReverseNo {
	static Scanner scan = new Scanner(System.in); 
	
	public static int reverse1(int n) {
		int rev = 0;
		int temp = n;
		
		while(temp != 0) {
			rev = (rev * 10) + (temp%10);
			temp /= 10;
		}
		
		return rev;
		/*
		 * Note reverse of 100 will be 1
		 */
	}
	
	public static String reverse2(int n) {
		if(n == 0) {
			return "0";
		}
		
		boolean flag = false;
		if(n < 0) {
			n *= -1; //**********Compulsory
			flag = true;
		}
		
		String str;
		if(flag == true) str = "-";
		else str = "";
		
		int temp = n;
			
		while(temp != 0) {
			str += (temp%10);
			temp /= 10;
		}
		
		
		return str;	
		/*
		 * Note reverse of 100 will be 001 in the form of string 
		 */
	}
	
	public static void swap(char arr[], int i, int j) {
		if(i == j) {
			return;
		}
		arr[i] = (char)(arr[i] ^ arr[j]);
		arr[j] = (char)(arr[i] ^ arr[j]);
		arr[i] = (char)(arr[i] ^ arr[j]);
	}
	
	public static String reverse3(String str) {
		
		char arr[] = str.toCharArray();
		
		int i = 0, j = arr.length-1;
		
		while(i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
		
		str = new String(arr);
		return str;
	}
	
	//Main method
	public static void main(String []arg) {
		int n = scan.nextInt();
		
		int rev = reverse1(n);
		System.out.println(rev);
		
		String rev2 = reverse2(n);
		System.out.println(rev2);
		
		String rev3 = reverse3("12341");
		System.out.println(rev3);
		
	}
}
