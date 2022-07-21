package com.assignment11;

public class VehicleUse {
	public static void main(String[] arg) {
		Vehicle v = new Vehicle();
		v.maxSpeed = 0;
		v.setColor("Red");
		v.print();
		
		Bicycle b = new Bicycle();
		b.maxSpeed = 20;
		b.setColor("Blue");
		b.print();
		
		Car c = new Car();
		c.maxSpeed = 200;
		c.doors = 4;
		c.setColor("Black");
		c.print();
	}
	
}
/*
Output:

Vehicle Red maxSpeed: 0
Bicycle Blue maxSpeed: 20
Car Black MaxSpeed: 200 Doors:4
*/

/*
11. A11
Function OverRiding:

1. Create A10
2. Create print function in Vehicle , Bicycle, Car
OverRide print function
*/