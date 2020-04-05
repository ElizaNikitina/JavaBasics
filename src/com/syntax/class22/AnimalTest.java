package com.syntax.class22;

public class AnimalTest {
	public static void main(String[] args) {
		
		//non primitive casting: upcasting
		Animal obj = new Tiger();
		
		obj.sleep();
		obj.eat();
	
		
		Animal obj2 = new Animal();
		obj2.sleep();
		obj2.eat();
		
		Tiger tiger = new Tiger();
		
		tiger.sleep();
		tiger.eat();
		tiger.run();
	}
	
	

	
	
}
