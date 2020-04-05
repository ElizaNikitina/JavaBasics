package com.syntax.class22;

public class Parent {
	
	static void bye() {
		System.out.println("Bye from my parent class");
	}
	
	Parent(){
		System.out.println("Parent class constructor");
	}
	private void hello() {
		System.out.println("Hello from parent class");
	}

}
class Child extends Parent{
	//we are not overriding we just declaring child class method inside
	// the child classe
	//@Override
	private void hello() {
		System.out.println("Hello from child class");
	}
	
	Child(){
		System.out.println("Child class constructor");
	}
//	@Override
//	static void bye() {
//		System.out.println("Bye from my child class");
//	}
}