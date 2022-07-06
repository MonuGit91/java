package com.oops1;

public class Student {
	public String name;
	final private int rollNo;
	public float cgpa;
	public final static double CONVERSIONFACTOR = 0.9;
	private static int noOfStudents = 0;
	
//	public Student() {
//		//this.name = "";
//		//this.rollNo = 0;
//	}
	
//	public Student(String name) {
//		this.name = name;
//	}
	
	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		noOfStudents++;
	}
	
	public int getRollNo() {
		System.out.println("this: " + this);
		return rollNo;
	}
	
//	public void setRollNo(int rollNo){
//		if(rollNo <= 0) return;
//		this.rollNo = rollNo;
//	}
	
	public void print() {
		System.out.println(this.rollNo + " " + this.name);
	}
	public static void getNumOfStudent() {
		System.out.println("no of Students: " + Student.noOfStudents);
	}
}
