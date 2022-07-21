package com.assignment12;

import com.assignment10.*;

public class Truck extends Vehicle{
	int maxLoadingCapacity;
	
	public void print() {
		System.out.println("Truck:");
		System.out.println("Maximum Speed: " + maxSpeed);
		System.out.println("Maximum Load: " + maxLoadingCapacity);
	}
}
