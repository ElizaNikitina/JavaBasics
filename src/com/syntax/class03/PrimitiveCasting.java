package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//widening, happens implicitly
		double d = 10;
		System.out.println(d);
		
		// int a = 10.99; -->compile time error saying:
		// type mismatch, cannot convert bouble to intiger;
		
		//narrowing, explicitly implementing
		int a = (int)10.99;
		System.out.println(a);
		
		//byte -128 to 127
		byte b = (byte)1284;
		System.out.println(b);
	}

}
