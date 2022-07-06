package com.oops1;

public class StudentUse {
	public static void main(String[] arg) {
//		Student s0 = new Student();
//		System.out.println("s0: " + s0);
//		s0.print();
		Student.getNumOfStudent();
		Student s1 = new Student("Monu", 12);
		System.out.println("\ns1: " + s1);
		s1.print();		
		Student.getNumOfStudent();
		
//		Student s2 = new Student("Choudhary");
//		System.out.println("\n\n" + s2);
//		s2.print();
//		s2.setRollNo(13);
//		s2.print();
		
	}
}
