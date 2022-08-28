package com.assignment17;

public class ExceptionDemo {
	
	private static int devide1(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException();
		}
		
		return a/b;
	}
	
	public static int devide2(int a, int b) throws DevideByZeroException {
		if(b == 0) {
			throw new DevideByZeroException();
		}
		return a/b;
	}
	
	public static void main(String[] arg) {
		//1:
//		devide1(10, 0);
//		System.out.println("Main1");
		
		//2:
		try {
			devide2(10, 0);
			System.out.println("Main2.0");
		}
		catch(DevideByZeroException e) {
			System.out.println("DevideByZeroException");
		}
		
		System.out.println("Main2.1");
	}

	
}
/*
Output:
DevideByZeroException
*/

/*
17. A17
Exception Handling - 1:

1. Create ExceptionDemo and exception
2. Create devide by zerw exception and rase it
*/