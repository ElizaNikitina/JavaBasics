package com.syntax.class25;

public interface Drivable {
	
	
	//public static final  compiler adds it by default
	 boolean MOVE__FAST = true;
	 
	 //public abstract compiler adds it by default
	  void drive();

}

abstract class Vehicle{
	
	abstract void stop();
}

class Car extends Vehicle implements Drivable{

	@Override
	public void drive() {
		System.out.println("Car drives");// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		System.out.println("Car stops");// TODO Auto-generated method stub
		
	}
	
}