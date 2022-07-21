package com.assignment8;

public class Student {
	public String name;
	private int rollNo;
	private static int noOfStudent;
	
	Student() {
		this.rollNo = ++Student.noOfStudent;
	}
	
	static void getNoOfStudent() {
		System.out.println(Student.noOfStudent);
	}
}
