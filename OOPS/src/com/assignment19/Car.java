package com.assignment19;

public class Car extends Vehicle{
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
}
