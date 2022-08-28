package com.assignment15;

public class VehicleUse {
	public static void main(String []arg) {
		Vehicle v = new Car();
		v.maxSpeed = 100;
		v.setColor("Red");
//		v.doors = 4; can not do that because it checked at compile time(compiler show v is Vehicle type)
		
		//Runtime polymorphism 
		v.print();//compile time compiler thinks it is of vehicle's print but at run time it is of Car type
	}
}
/*
 * CAR color Red maxSpeed 100
 */

/*
15. A15
Polymorphism

1. Create Vehicle and car class
2. Store Cars object in Vehicle
3. Try to access all variables
4. Create print function in Vehicle and override it in car
Access print function as v.print() and see which print function is working//**Run time polymorphism
*/