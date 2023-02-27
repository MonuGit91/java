package dsa.others.others;

import java.util.Scanner;

public class PrimeSum {
	public int findSumOfPrimes (int[] input1, int input2) {
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int sumMax = 0;
		int maximum = Integer.MIN_VALUE;
		boolean flag = false;
		
		for(int i = 0; i < input2; i++) {
			flag = prime(input1[i]);
			
			if(flag) {
				min = Math.min(min, input1[i]);
				sum += input1[i];
			}
			
			sumMax += input1[i];
			maximum = Math.max(maximum, input1[i]);
		}
		
		if(sum != 0) return sum - min;
		else return sumMax - maximum;
	}
	
	private static boolean prime(int n) {
		if(n == 1 || n == 2 || n == 3) return true;
		
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 41, 18, 50, 43, 31, 29, 25, 59, 87};
		int n = 10;
		PrimeSum obj = new PrimeSum();
		int num = obj.findSumOfPrimes(arr, n);
		System.out.println(num);
	}
}
