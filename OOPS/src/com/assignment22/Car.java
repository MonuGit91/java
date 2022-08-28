package com.assignment22;

//since Vehicle is incomplete so car is also incomplete compulsory to make car as abstract
abstract public class Car extends Vehicle {
//public class Car extends Vehicle {//we can write this line after completing the abstract method ie, see line 27 
	int doors;
	int maxGear;
	
	public Car() {
		super();
		System.out.println("Car's Constructor1");
		doors = 4;
		maxGear = 5; 
	}
	
	public Car(int doors, int maxSpeed) {
		super(maxSpeed);
		System.out.println("Car's Constructer2");
		this.doors = doors;
	}
	
	public void print() {
//		super.print();
		System.out.println("Car doors " + doors + " maxGear " + maxGear);
	}

//	public boolean isMotorized() {
//		return true;
//	}
}
