package com.assignment13;

public class Car extends Vehicle{
	int doors;
	int maxSpeed;
	
	void print() {
		super.print();
		
		System.out.println("Car\n" + "maxSpeed: " + maxSpeed);
		System.out.println("Vehicles maxSpeed: " + super.maxSpeed);
	}
}
