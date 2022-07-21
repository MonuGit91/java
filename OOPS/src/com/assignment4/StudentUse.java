package com.assignment4;

public class StudentUse {
	public static void main(String[] arg) {
		Student s1 = new Student();
		s1.setter(23);
		s1.getter();
	}
}
/*OUTPUT:
 
rollNo: 0
this.rollNo: 23
*/

/*
4. A4

This keyWord:
1. Set setter variable rollNo(local variable) same as member variable of the class 
2. Access the member variable of the class 
Print the value of this keyword and the object variable

*/