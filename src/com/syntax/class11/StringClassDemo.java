package com.syntax.class11;

public class StringClassDemo {

	public static void main(String[] args) {
		String school ="Syntax";
		
		String str = new String("HELLO ");
		String str1 = "This is a String 774.89";
		
		//how many characters String has
		
		System.out.println(school.length());
		
		int size =str.length();
		System.out.println("String length is " + size);
		
		//conver String to lowerCase or upperCase
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		//concatinate 2 Strings
		
		String newString=str+" "+school;
		System.out.println(newString);
		
		String newString1=str.concat(school);
		System.out.println(newString1);
	
		// isEmpty function
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		String str4="33";
		boolean empty1=str4.isEmpty();
		System.out.println(empty1);
		
		//trim function
		String str5="  Welcome to synrax!   ";
		System.out.println(str5);
		str5=str5.trim();
		System.out.println(str5);
		
		

	}

}
