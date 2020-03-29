package com.syntax.class19;

public class ConstaructorCall {
	
	public ConstaructorCall() {
		System.out.println("I am non argument constructor");
	}
	
	public ConstaructorCall(String str) {
		this();// call constructor of current class (в скобках указываем параметры конструктора)
		
	}
	
	public ConstaructorCall(String str, String str1) {
		this("Hello");
	}
	
	public static void main(String[] args) {
		ConstaructorCall obj = new ConstaructorCall("Java", "Love");
	}

}
