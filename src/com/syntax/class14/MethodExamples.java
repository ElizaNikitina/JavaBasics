package com.syntax.class14;

public class MethodExamples {

	
	//want to create a method that will be greeting a person
	
	void greet() {
		System.out.println("Hello Eliza");
	}
	
	void greet1(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void main(String []args) {
		
		
		MethodExamples object1	= new MethodExamples();
		object1.greet();
		object1.greet1("Artem");
		object1.greet1("Jhon");
		object1.greet1("Asel");
		object1.greet1("Gulen");
		
	}
}
