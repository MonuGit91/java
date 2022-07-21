package com.assignment11;

public class Car extends Vehicle{
	int doors;
	
	public void print() {
		System.out.println("Car " + getColor() +  " MaxSpeed: " +maxSpeed + " Doors:" + doors);
	}
}
