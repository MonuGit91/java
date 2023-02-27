package dsa.oops1;
import java.util.Scanner;

public class Fraction {
	private int numerator;
	private int denominator;
	
	Scanner scan = new Scanner(System.in);
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public Fraction() {
		
	}
	
	public void setNumeDeno() {
		this.numerator = scan.nextInt();
		this.denominator = scan.nextInt();
		
		if(denominator == 0) {
			while(denominator == 0) {
				System.out.println("0 as a denominator is invalid \nplease give valid denominator: ");
				denominator = scan.nextInt();
			}
		}
		simplify();
	}
	
	private void simplify() {//simplifies the fraction
		int minVal = Math.min(numerator, denominator);
		
		int gcd = 1;
		for(int i = 1; i <= minVal; i++) {
			if((numerator%i == 0) && (denominator%i == 0)) gcd = i;
		}
		
		numerator /= gcd;
		denominator /= gcd;
	}
	
	public void increase() {//Increments the value of fraction
		numerator += denominator;
		simplify();
	}
	
	public void addFracrion(Fraction frac) {
		denominator *= frac.denominator;
		numerator = (this.numerator * frac.denominator) + (frac.numerator * this.denominator);
		this.simplify();
	}
	
	public static Fraction addFraction(Fraction frac1, Fraction frac2) {
		int deno = frac1.denominator * frac2.denominator;
		int nume = (frac1.numerator * frac2.denominator) + (frac2.numerator * frac1.denominator);
		
		Fraction obj = new Fraction(nume, deno);
		return obj;
	}
	
	public void display() {
		System.out.println(numerator + "/" + denominator);
	}
}
