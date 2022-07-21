package com.assignment1;

public class StudentUse {
	public static void main(String []arg) {
		Student s1 = new Student();
		Student s2 = new Student();

		System.out.println("Address of 1st obj: " + s1);
		System.out.println("Address of 2nd obj: " + s2 + '\n');
		
		
		System.out.println("default value in name: " + s1.name);
		System.out.println("default value in rollN0: " + s1.rollNo + "\n");
		
		s1.name = "Monu Choudhary";
		s1.rollNo = 19;
		
		System.out.println("s1 name: " + s1.name);
		System.out.println("s1 rollN0: " + s1.rollNo + "\n");
		
	}
}
/*
OUTPUT:
 
Address of 1st obj: com.assignment1.Student@3cb5cdba
Address of 2nd obj: com.assignment1.Student@1b0375b3

default value in name: null
default value in rollN0: 0

s1 name: Monu Choudhary
s1 rollN0: 19
*/



/*
Implementation Problem:
1.
	1. Creat Student Class
	2. Creat Properties of class:
		a. Name
		b. rollNo
		
	3. Creat student use class
		a. Create 2  student object with default constructor
		b. Print address of the created object
		c. Where will refrence variable created and object created(stack memory and heap memory)
		d. Check default values of properties of students
		e. Set name and roll no and print 

 */
