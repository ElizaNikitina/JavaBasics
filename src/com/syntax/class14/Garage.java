package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		
		//build individual object
		
		Car car1 = new Car();
		car1.make = "Lamborghini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Blue";
		
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "M5";
		car2.year = 2019;
		car2.color = "Pink";
		
		Car car3 = new Car();
		
		System.out.println(car1.make);
		
		//accessing behavior/methods of Car with car1
		car1.drive();
		car1.accelerate();
		car1.makeNose();
		
		System.out.println(car2.make);
		car2.drive();
		car2.accelerate();
		car2.makeNose();
		
		
	}

}
