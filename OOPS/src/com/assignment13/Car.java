package com.assignment13;

public class Car extends Vehicle{
	int doors;
	
	void print() {
		super.print();
		
		System.out.println("Car\n" + "maxSpeed: " + maxSpeed);
		System.out.println("Vehicles maxSpeed: " + super.maxSpeed);
	}
}
