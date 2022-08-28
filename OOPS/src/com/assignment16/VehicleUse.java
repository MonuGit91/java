package com.assignment16;

public class VehicleUse {
	public static void main(String[] arg) {
		//Statement 1:
		Vehicle v = new Car();
		Car c = (Car)v;
		c.doors = 4;
		
		//Statement 2:
		Vehicle v1 = new Car();
		v = new Bicycle();
		Car c1 = (Car)v;
		c.doors = 4;//Now it will give class cast exception at run time because v = new Bicycle();
		
		//Statement 3:
		Object o = new Vehicle();
		Object o1 = new Car();
		Object o3 = new Bicycle();
		//o.
	}

}
