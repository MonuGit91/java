package com.assignment2;

public class StudentUse {
	public static void main(String[] arg) {
		Student s1 = new Student();
		
		s1.name = "Monu Choudhary";//public accessible anywere
//		s1.classRollNo = 23; //private: accessible within class
		s1.collegeRollNo = 192600123; //default: accessible within packeg
		
		System.out.println("public variable name: " + s1.name);

		System.out.println("\ndefault variable collegerollNo: " + s1.collegeRollNo);
	}
}
/*
 * OUTPUT:
public variable name: Monu Choudhary

default variable collegerollNo: 192600123

 */



/*
2. A2

Access Modifiers:
1. Do as A1
2. Make rollNo private
Access all variables which are accessible and write there access modifier

*/