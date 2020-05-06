package com.syntax.class33;

public class ExeptionIntro {
	
	static String str;
	
	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		
		//System.out.println(a/b); ---> java.lang.ArithmeticException: / by zero
		
		System.out.println("End of program");
		System.out.println();
		
		int[] array= {12, 1, 13};
	//	System.out.println(array[3]); ----> java.lang.ArrayIndexOutOfBoundsException: 3
		 
		//System.out.println(str.length()); ---->java.lang.NullPointerException
		
		NullPointerException npe = new NullPointerException();
		throw(npe);
	}

}
