package com.assignment23;

public class VehicleUse {
	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
//		Car c = new Car();
//		Bicycle b = new bicycle();
//we can not create object of abstract class

		Vehicle v;
		Car c;
		Bicycle b;
		
		c =  new BMW();
		BMW bmw = new BMW();
		
	}
}
/*
Output:

Vehicle's Constructer1
Vehicle's Constructer1
*/

/*
23. A23
Abstract and inheritance chain:

1. Create hierarchy of abstract class
2. Create Vehicle with abstract methods
3. Create car with one abstract method
4. Create Bicycle with one abstract method
5. Create BMW car which extends Car and implement rest abstract method 
Create object of BMW
*/