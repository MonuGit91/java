package com.assignment24;

public class VehicleUse {
	public static void main(String[] arg) {
		VehicleInterface vi;//we can not create object of Interface
		vi = new Vehicle();
		vi.isMotorized();
		vi.name();
//		vi.print(); 
//vi is VehicleInterface type and VehicleInterface doesn't have print method so it will give compile time error

		
		Vehicle v = new Vehicle();
		v = new Vehicle();
		v.isMotorized();
		v.name();
		v.print();
	}
}
/*
output:

Vehicle's constructor
Vehicle's constructor
*/

/*
24. A24
Interface Introduction:

1. Create a Interface VehicleInterface
2. Create class Vehicle and mplement VehicleInterface
3. Create Vehicle Interface refrance and store object of Vehicle
*/