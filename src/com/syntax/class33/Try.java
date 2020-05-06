package com.syntax.class33;

public class Try {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(200);
			System.out.println("no exeption");
		}catch(InterruptedException e) {
			System.out.println("Cached File");
		}
		
		int a = 10;
		int b=0;
		try {
			System.out.println(a/b);
			System.out.println("no exeption");
		}catch(ArithmeticException ae) {
			System.out.println("Cathed ArithmeticException Exception");
		}
			
		
	}
}
