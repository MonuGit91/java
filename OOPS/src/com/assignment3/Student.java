package com.assignment3;

public class Student {
	public String name;
	private int rollNo;
	
	public void getter() {
		System.out.println(rollNo);
	}
	public void setter(int val) {
		if(val < 0) {
			return;
		}
		rollNo = val;
	}
}
