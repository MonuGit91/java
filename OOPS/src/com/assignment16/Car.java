package com.assignment16;

public class Car extends Vehicle{
	int doors;
	
	public void print() {
		System.out.println("CAR color " + this.getColor() + " maxSpeed " + this.maxSpeed);
	}
}
