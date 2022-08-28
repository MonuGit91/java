package com.assignment18;

public class ExceptionHandelingDemo {
	public static int divide(int a, int b) throws DivideByZeroException {
		if(b == 0) {
			throw new DivideByZeroException();
		}
		return a/b;
	}
	public static int factorial(int n) throws negativeNumberException{
		if(n == 1) return 1;
		
		if(n < 0) {
			throw new negativeNumberException();
		}
		return n*factorial(n-1);
	}
	
	public static void main(String[] arg) {
		try {
			divide(10, 0);
			factorial(-10);
			Fraction f = new Fraction(10, 0);
		}
		catch(negativeNumberException e) {
			System.out.println("NegativeNumberException");
			
			System.out.println("Give +ve Number");
		}
		catch(DivideByZeroException e) {
			System.out.println("DivideByZeroException");
		}
		catch(Exception e) {
			System.out.println("GenericException");
		}
		finally {
			System.out.println("Finally");
		}
		
		System.out.println("Main");
		
		
	}
}
/*
Output:

DivideByZeroException
Finally
Main
*/

/*
18. A18
Exception Handling - 2:

1. Create A17
2. Create another factorial function and rase negative number Exception
3. Put try and factorial and divide function in try block and catch it and see flow

19. A19
Finally block:
*/