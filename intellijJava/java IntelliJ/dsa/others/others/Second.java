package dsa.others.others;

import java.util.*;

public class Second {
	public static Scanner scan = new Scanner(System.in);
	
	public static int reached(int n, int k) {
		if(n == 0 || n == 1) {
	        return 1;
	    }
	    else if(n == 2) {
	        return 2;
	    }
	    else if(n ==3){
	        return 4;
	    }
	    
		int sum = 0;
		for(int i = 0; i < k; i++) {
			int s = reached(n-i, k) % (int)(Math.pow(10, 9)+7);
			sum = (s + sum) % (int)(Math.pow(10, 9)+7);
		}
	    return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, k;
		n = scan.nextInt();
		k = scan.nextInt();
		
		int ways = reached(n, k);
		System.out.println(ways);
	}

}
