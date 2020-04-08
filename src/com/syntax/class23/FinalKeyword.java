package com.syntax.class23;

public class FinalKeyword {
	
	public static String str = "Hello";
	public static final String str1 = "Bye";
	
	
	
	public static void main(String[] args) {
		
		str = "Hi";
		//str1 = "Good by"; CE:
	}
	
	public final void hello() {
		System.out.println("I am a final method");
	}
	public final void hello(String s) {
		System.out.println("I am a final method");
	}

}

class SubClass extends FinalKeyword{
	
//	public void hello() {
//		System.out.println("I am a final method");
//	}

}
