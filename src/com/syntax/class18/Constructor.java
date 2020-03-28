package com.syntax.class18;

public class Constructor {

	static String str = "Hello";

	Constructor() {
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}

	Constructor(String a) {
		System.out.println("I am a constructor with 1 String parametr " + a);
	}
	
	Constructor(int b) {
		System.out.println("I am a constructor with 1 integer parametr " + b);
	}
//	Constructor(int b) {
//		System.out.println("I am a constructor " + b);
//	}
	
	Constructor(String a, int b) {
	System.out.println("I am a constructor with 2 parametrs " + a +" & " + b);
	}

	public static void main(String[] args) {

		// Constructor obj = new Constructor();

		System.out.println(str);
		new Constructor();

		Constructor demo = new Constructor(2);
		Constructor demo1 = new Constructor("Eliza",2);
		Constructor demo2 = new Constructor("Eliza");
	}
}
