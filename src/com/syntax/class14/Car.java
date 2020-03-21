package com.syntax.class14;

public class Car {

	// define feature of the car

	String model;
	String make;
	int year;
	String color;

	// define behavior
	void drive() {
		System.out.println(make + " Car can drive");
	}
	
	void accelerate() {
		System.out.println(make + " Car can accelerate");
	}
	
	void makeNose() {
		System.out.println(make + " Car make noise");
	}
}
