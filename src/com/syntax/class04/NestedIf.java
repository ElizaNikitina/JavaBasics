package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
	 boolean classToday = true;
	 boolean flag = false;
	 
	 if(flag) {
		 System.out.println("Hello");
		  
		 if(classToday) {
			 System.out.println("HelloFriend");
		 }
		 else {
			 System.out.println("Hello famaly");
		 }
	 }
	 else {
		 System.out.println("Buy");
	 }
		System.out.println("I am out of IF condition");
	}

}
