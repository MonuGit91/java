package com.assignment14;

public class Vehicle {
	private String color;
	protected int maxSpeed;
	
	public Vehicle() {
		System.out.println("Vehicle's Constructor1");
	}
	public Vehicle(int speed) {
		System.out.println("Vehicle's Constructor2");
		maxSpeed = speed;
	}
	
	public void SetColor(String color) {
		this.color = color;
	}

}
