package com.assignment21;

//final class Vehicle {//final class can not be inherited
	class Vehicle {
		final int maxSpeed;//We can set final variable only once
		private String color;
		
		public Vehicle() {
			System.out.println("Vehicle's Constructer1");
			maxSpeed = 60;//here initializing maxSpeed and after this no one can change it
		}
		
		public Vehicle(int maxSpeed) {
			this.maxSpeed = maxSpeed;//here initializing maxSpeed and after this no one can change it
			System.out.println("Vehicle's Constructer2");
		}
		
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}
		
//		final public void print() {//now print function can not be overloaded because of final keyword
			public void print() {	
			System.out.println("Vehicle "+ "color " + color + " maxSpeed " + maxSpeed);
		}
	}
	class Car extends Vehicle{
		int doors;
		int maxGear;
		
		public Car() {
			super();
			System.out.println("Car's Constructor1");
			doors = 4;
			maxGear = 5; 
		}
		
		public Car(int doors, int maxSpeed) {
			super(maxSpeed);
			System.out.println("Car's Constructer2");
			this.doors = doors;
		}
		
		public void print() {
//			super.print();
			System.out.println("Car doors " + doors + " maxGear " + maxGear);
		}
	}

public class VehicleUse {
	public static void main(String[] args) {
		Car c = new Car();
		c.print();
	}
}
/*
21. A21
Final Keyword

	1. Give eg. Of final variable
	2. Give eg, of final Function
	3. Give eg, of final class
*/
