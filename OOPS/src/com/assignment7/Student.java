package com.assignment7;

public class Student {
	public String name;
	private int rollNo;
	static private int noOfStudent;
	int cgpa;
	final static double CONVERSIONFACTOR = 0.91;
	
	Student() {
		this.rollNo = ++Student.noOfStudent;
	}
	
	public void getNoOfStudent() {
		System.out.println(noOfStudent);
	}
	
}
