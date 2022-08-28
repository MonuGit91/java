package com.assignment18;

import com.assignment17.DevideByZeroException;

public class Fraction {
	Fraction(int a, int b) throws DivideByZeroException{
		if(b == 0) {
			throw new DivideByZeroException();
		}
	}
}
