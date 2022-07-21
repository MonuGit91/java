package com.assignment9;

public class InheritanceStudent extends InheritancePerson{
	private int rollNo;
	private static int npOfStudent;
	
	public InheritanceStudent() {
		this.rollNo = ++InheritanceStudent.npOfStudent;
		
	}
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Roll No: " + this.rollNo);
	}
}
