package com.assignment24;

public class Vehicle implements VehicleInterface{
	Vehicle() {
		System.out.println("Vehicle's constructor");
	}
	
	public void print() {
		System.out.println("Vehicle");
	}
	
	public boolean isMotorized() {
		return true;
	}
	
	public String name() {
		return "name";
	}
}
