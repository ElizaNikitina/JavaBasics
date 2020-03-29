package com.syntax.class18;

public class Car {
	
	String make, model, color;
	int year;
	
	
	
	public void showInfo() {
		System.out.println("I have " +year +" " + make + " " + model + " in " + color + " color");
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.make = "BMW";
		car.model = "m5";
		car.year = 2020;
		
		car.showInfo();
		
		
		
		System.out.println("=======");
		Car car1 = new Car();
		//we are using instance variable without assining any value
		//constructor initializes all instance variable and assign default value to them
		car1.showInfo();
		
//		int door;
//		System.out.println(door);  CE: local variables must be initialized
		
		
		
	}

}
