package com.assignment10;

public class VehicleUse {
	public static void main(String[] arg) {
		Vehicle v = new Vehicle();
		v.maxSpeed = 0;
		v.setColor(" red");
		v.print();
		
		Bicycle b = new Bicycle();
		b.maxSpeed = 20;
		b.setColor(" Blue");
		b.print();
		
		Car c = new Car();
		c.maxSpeed = 200;
		c.setColor(" Black");
		c.print();
	}
}
/*
Output:
 
Vehicle red 0
Vehicle Blue 20
Vehicle Black 200
 
 */

/*
10. A10
Inheritance and private members:

1. Create Vehicle class with- color, maxSpeed
2. Create Car class with- doors
3. Create Bicycle class
4. Extend Vehicle
Make color private and access it in both class
*/