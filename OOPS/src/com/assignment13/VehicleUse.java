package com.assignment13;

public class VehicleUse {
	public static void main(String[] arg) {
		Vehicle v = new Vehicle();
		v.color = "red";
		v.maxSpeed = 0;
		
		Car c = new Car();
		c.color = "Black";
		c.maxSpeed = 100;
		
		c.print();
	}
}
