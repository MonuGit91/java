package com.assignment12;

public class VehicleUse {
	public static void main(String[] arg) {
		Truck t = new Truck();
		t.maxLoadingCapacity = 1000;
//		t.maxSpeed = 200;//** protected member accessible within package and child class(out side package)
		
		t.print();
	}
}
/*
Truck:
Maximum Speed: 0
Maximum Load: 1000
*/

/*
12. A12
Protected Modifier:**

1. Create A10
2. Make Truck class
3. Extend Vehicle class from another package
4. Access members of vehicle
Make maxSpeed of vehicle as protected and access it
*/