package com.assignment25;

//we can implement more then one interface but we can extent only one calss
public class Car extends Vehicle implements VehicleInterface, CarInterface{
	public boolean isMotorized() {//It is present in both Interfaces and it is write
		return true;
	}
	public String name() {//It is present in both Interfaces and it is write
		return "bmw";
	}
	
	public int gears(int a) {
		return a;
	}
	
	void print() {
//		System.out.println(PI);//It will not work because PI is present in both Interfaces(it is only for variable)
		System.out.println("Car");
	}
	
}
