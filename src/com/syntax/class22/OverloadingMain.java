package com.syntax.class22;

public class OverloadingMain {

	public static void main(String[] args) {
		System.out.println("method with string array arguments");
	}
	
	public static void main(int[] args) {
		System.out.println("method with int array arguments");	
	}
	
	public static void main(String args, String args1) {
		System.out.println("method with two string array arguments");
		
	}
}
