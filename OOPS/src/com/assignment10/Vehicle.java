package com.assignment10;

public class Vehicle {
	private String color;
	protected int maxSpeed;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void getter() {
		System.out.println(color);
	}
	
	public void print() {
		System.out.println("Vehicle" + color + " " + maxSpeed);
	}
}
