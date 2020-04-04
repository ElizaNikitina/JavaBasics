package com.syntax.class22;

public class Recap {
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public void hello(String name) {
		System.out.println("Hello " + name);
	}
	
	
	//CE overloading is not possible by changing access modifier
//	private void hello(String str) {
//		System.out.println(str);
//	}
	
	//CE overloading is not possible by changing return type	
//	public String hello(String name) {
//		return name;
//	}

}
