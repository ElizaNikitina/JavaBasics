package com.syntax.class17;

public class Task02_reverce {
	
	//Create a method that will take a String as a parameter
	//and returns reverse String. 
	//Method should be available to all classes 
	//within your projects and accessible by class name.
	
	
	
 public static String name(String one) {
	 String rev = "";
	 for (int i = one.length() - 1; i >= 0; i--) {
			rev +=  one.charAt(i);
		}
	 return rev;
 }
 
 public static void main(String[] args) {
	Task02_reverce  obj = new Task02_reverce ();
	System.out.println(obj.name("accessible everywhere"));
	
	String a = Task02_reverce.name("Hello");
}
}
