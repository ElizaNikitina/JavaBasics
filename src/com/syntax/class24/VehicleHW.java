package com.syntax.class24;

public abstract class VehicleHW {

	static int totalVehicle;

	String color;

	VehicleHW(String color) {
		this.color = color;
	}

	public static void total() {
		System.out.println("We build " + totalVehicle);
	}

	public void drive() {
		System.out.println("Vehicle can drive");
	}

	public void stop() {
		System.out.println("Vehicle can stop");
	}

	public abstract void start();

	public abstract void brake();
}

class Bus extends VehicleHW {
	int routNumber;

	Bus(String color, int routNumber) {
		super(color);
		this.routNumber = routNumber;

	}

	@Override
	public void start() {
		System.out.println("Bus " + routNumber + " goes on a route");

	}

	@Override
	public void brake() {
		System.out.println("Bus has to stop on bus stop");

	}
}

class ShcoolBus extends Bus {

	ShcoolBus(String color, int routNumber){
		super(color, routNumber);
	}
	
}
