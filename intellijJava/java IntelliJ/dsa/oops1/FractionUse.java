package dsa.oops1;

public class FractionUse {
	public static void main(String[] arg) {
		Fraction frc1 = new Fraction(10, 14);
		frc1.display();
		
		Fraction frc2 = new Fraction();
		frc2.setNumeDeno();
		frc2.display();
		
		frc1.increase();
		frc1.display();
	
		Fraction frc3 = Fraction.addFraction(frc1, frc2);
		frc3.display();
	}

	
}
