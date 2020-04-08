package com.syntax.class24;

public abstract class Vehicle {

	String color;

	Vehicle(String color) {
		this.color = color;
	}

	public void driveO() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Vehicle can stop");
	}

	public abstract void start();

	public abstract void brake();
}

abstract class Car extends Vehicle {

//	Car(String color){
//		super(color);
//	}

	String carType;

	Car(String color, String carType) {
		super(color);
		this.carType = carType;
	}

	public void brake() {
		System.out.println(carType + " has brakes");
	}
}

class Tesla extends Car {
	String make;

	Tesla(String color, String carType, String make) {
		super(color, carType);
		this.make = make;
	}

	public void start() {
		System.out.println(make + " stars remotly");
	}
}

class Toyota extends Car {

	Toyota(String color, String carType, String make) {
		super(color, carType, make);
}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
}