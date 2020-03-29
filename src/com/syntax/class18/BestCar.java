package com.syntax.class18;

public class BestCar {
	
	String make, model, color;
	int year, doors, wheels;

	public void showInfo() {
		System.out.println("I have " + year + " " + make + " " + model + " in " + color + " color");
		System.out.println(make  + " has " + doors + " doors and " + wheels + " wheels");
	}
	
	BestCar(String carMake, String carModel, String carColor, int carYear, int carDoors, int carWheels){
		make = carMake;
		model = carModel;
		color = carColor;
		year = carYear;
		doors = carDoors;
		wheels = carWheels;
		
	}
	public static void main(String[] args) {
		//once we created our own constructor compiler will not be creating default constructor for us
		//BestCar car = new BestCar(); CE
		
		BestCar car = new BestCar("BMW", "m5", "grey", 2020, 4,5);
		car.showInfo();
		System.out.println(car);
		System.out.println(car);
		
		// BestCar car1=new BestCar("Toyota", "Camry")  CE: no this type of constructor
		
		
	}

}
