package com.assignment4;

public class Student {
	public String name;
	private int rollNo;
	
	public void setter(int rollNo) {
		if(rollNo <= 0) return;
		this.rollNo = rollNo;
	}
	
	public void getter() {
		int rollNo = 0;
		System.out.println("rollNo: " + rollNo);
		System.out.println("this.rollNo: " + this.rollNo);
	}
}
