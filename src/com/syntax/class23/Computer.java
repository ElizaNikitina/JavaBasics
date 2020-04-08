package com.syntax.class23;

public class Computer {
	
	String make;
	String memory;

	public Computer(String make, String memory) {
		this.make = make;
		this.memory = memory;
	}
	public void use() {
		System.out.println("Everybody use computers");
	}
	public void showInfo() {
		System.out.println("I have " + make +" and memory is " + memory);
	}
}

class Apple extends Computer{
	public Apple(String make, String memory) {
		super(make, memory);
	}
	public void showInfo() {
		System.out.println(make + " new model works 24 hours");
		System.out.println("I have " + make +" and memory is " + memory);
	}
}

class Lenovo extends Computer{
	public Lenovo(String make, String memory) {
		super(make, memory);
	}
	public void showInfo() {
	System.out.println("I have never used before");
	System.out.println(make +"  memory is " + memory);
}
}
class HP extends Computer{
	public HP(String make, String memory) {
		super(make, memory);
	}
	
	public void showInfo() {
		
		System.out.println(make +"  memory is " + memory);
	}
}

class Dell extends Computer{
	public Dell(String make, String memory) {
		super(make, memory);
	}
}