package com.syntax.class22;

public class OverloadingMain {
	static String str = "Syntax";

	public static void main(String[] args) {
		System.out.println("method with string array arguments");
		
		OverloadingMain.main("str");
		main("str");
		main("hello", "hi");
		main(new int[2]);
	}
	
	public static void main(int[] args) {
		System.out.println("method with int array arguments");	
	}
	
	public static void main(String args, String args1) {
		System.out.println("method with two string array arguments");	
	}
	
	public static void main(String args) {
		System.out.println("method with string  arguments");
	}
}
