package com.assignment11;

public class Vehicle {
	private String color;
	int maxSpeed;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void print() {
		System.out.println("Vehicle " + color + " maxSpeed: " + maxSpeed);
	}
	
}
