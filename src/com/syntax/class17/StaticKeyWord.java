package com.syntax.class17;

public class StaticKeyWord {
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	static void displayGeneralInfo() {
		System.out.println("We are building " + brand + " with touch screen = " + touchScreen);
	}
	
	void displaySpecification(){
		System.out.println("We are build phone with " + memory + " GB memory in " + color + " color");
	}
	
	public static void main(String[]args) {
		
		brand = "Iphone";
		touchScreen = true;
		
		StaticKeyWord obj1 = new StaticKeyWord();
		obj1.color = "black";
		obj1.memory = 128;
		
		displayGeneralInfo();
		obj1.displaySpecification();
	}

}
