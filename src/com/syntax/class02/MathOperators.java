package com.syntax.class02;

public class MathOperators {
	public static void main(String[] arg) {
		
		int a, b;
		a = 10;
		b = 20;
		
		double d, c;
		d = 50;
		c = 60;
		
		int add = a + b;
		int subtract = a - b;
		int multiply = a * b;
		float divide = (float) a / b;
		double divide1 = (double) a/b;
		
		double s=d/c;
		System.out.println(s);
		
		System.out.println("The addition of 2 numbers " + a + " and " + b + " is equal to " + add);
		System.out.println("The subtract of 2 numbers " + a + " and " + b + " is equal to " + subtract);
		System.out.println("The multiply of 2 numbers " + a + " and " + b + " is equal to " + multiply);
		System.out.println("The divide of 2 numbers " + a + " and " + b + " is equal to " + divide);
		System.out.println("The divide of 2 numbers " + a + " and " + b + " is equal to " + divide1);
	}

}
