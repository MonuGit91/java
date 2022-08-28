package com.assignment25;

public class VehicleUse {
	public static void main(String[] arg) {
		VehicleInterface vi = new Car();
		vi.name();//this method is present in VehicleInterface
		vi.isMotorized();//this method is present in VehicleInterface
		
		CarInterface ci = new Car();
//		ci.name();//it will not work because it is not present in CarInterface
		ci.isMotorized();
		
	}
}
/*
25. A25
Interfaces and Inheritance:

1. Create Vehicle Interface and declare a variable (by default it will be public static final)
2. Use declared variable of Interface
3. Create class Car and extent Vehicle and implement Vehicle Interface
4. Create Car Interface
5. Implement Car Interface by Car
6. Create a abstract method in both Car Interface and Vehicle Interface with same name
But you can not create same named variable in 2 interfaces which are implemented in common class
*/