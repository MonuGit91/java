package com.assignment22;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Vehicle v = new Vehicle();//cann't create object because Vehicle is abstract
		Vehicle v; //we can create refrance of Vehicle
		
//		Car c = new Car();//cann't create object because Car is abstract
		
		Bicycle b = new Bicycle();//we can create object because we have implemented abstract method
	}

}
/*
Output:

Vehicle's Constructer1
*/

/*
22. A22
Abstract keyword:

1. Create abstract function in Vehicle
2. Create refrence to the class
3. Create car class and extend Vehicle
Complete Car class ie, complete abstract method in car class

*/