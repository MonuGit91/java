package com.recursion1;
//(a*b)%M = (a%M * b%M)%M
//(a/b)%M = (a%M * (b^-1)%M)%M
//(a+b)%M = (a%M + b%M)%M
//((a-b)%M = (a%M - b%M + M)%M
public class Power {
	public static int power(int x, int n) {
		if(n == 0) return 1;
        return x*power(x, n-1);
	}
	public static void main(String arg[]) {
		System.out.print(power(2, 5));
	}
}
