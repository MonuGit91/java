package com.assignment23;

public abstract class Vehicle {
	int maxSpeed;
	private String color;
	
	public Vehicle() {
		System.out.println("Vehicle's Constructer1");
		maxSpeed = 60;
	}
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("Vehicle's Constructer2");
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {	
		System.out.println("Vehicle "+ "color " + color + " maxSpeed " + maxSpeed);
	}
	
	//abstract method means incomplete method*****
	public abstract boolean isMotorized();
	public abstract String name();
}
