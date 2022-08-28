package com.assignment14;

public class Car extends Vehicle{
	int doors;
	int maxSpeed;
	
	public Car() {
//		super();
		System.out.println("Car's constructor1");
	}
	
	public Car(String color) {
		super(100);//****
		
		SetColor(color);
		System.out.println("Car's constructor2");
	}
	
}
