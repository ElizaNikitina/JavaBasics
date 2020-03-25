package com.syntax.class16;

public class InstanceVariavles {
	
	String name = "Jhon"; //instance variable
	
	public static void main(String[]args) {
		String name = "Eliza";
		System.out.println(name);
		
		InstanceVariavles obj = new InstanceVariavles();
		System.out.println(obj.name);
		
		obj.name = "Artem";
		System.out.println(name);
		System.out.println(obj.name);
		
		name = "Asel";
		System.out.println(name);
		System.out.println(obj.name);
		
	}
	
	
	

}
