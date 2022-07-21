package com.assignment5;

public class Student {
	public String name;
	private int rollNo;
	
	Student() {
		System.out.println("default: default constructor");
	}
	
	public Student(String name) {
		this.name = name;
		System.out.println("public: parameterised constructor");
	}
	
	private Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		System.out.println("private: parameterised constructor");
	}
	
	static Student setter(String name, int rollNo) {
		Student s = new Student(name, rollNo);
		return s;
	}
	
}
