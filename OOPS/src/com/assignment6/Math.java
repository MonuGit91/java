package com.assignment6;

public class Math {
	final float pi = 3.14f;
	int radius;
	float area;
	
	public static void main(String[] args) {
		Math circul = new Math();
		circul.radius = 10;
		
		circul.area = (circul.radius*circul.radius)*circul.pi;
		
		System.out.println("value of pi: " + circul.pi);
		System.out.println("value of radius: " + circul.radius);
		System.out.println("value of area: " + circul.area);
		
	}
}
/*
OUTPUT:

value of pi: 3.14
value of radius: 10
value of area: 314.0
*/

/*
6. A6
Final keyword:

Use final keyword for value of pi

*/