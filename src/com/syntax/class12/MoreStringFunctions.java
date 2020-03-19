package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {

		String me = "I am a good tester";

		// function replace

		String newMe = me.replace("a", "c");
		System.out.println(newMe);

		newMe = me.replace("good", "exelent");
		System.out.println(newMe);

		// ReplaceAll() function

		String str = "Phone number is 8981989898";
		str = str.replaceAll("[A-Z]", "");
		System.out.println(str);

		str = "Phone number is 8981989898";
		str = str.replaceAll("[a-z]", "");
		System.out.println(str);

		str = "Phone number is 8981989898";
		str = str.replaceAll("[A-Za-z]", "");
		System.out.println(str);

		str = str.trim();
		System.out.println(str);

		String str1 = "Hello1256538***  !!!78";
		str1 = str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z]","");
		System.out.println(str1);
		
		String str2="Hello123 &%^#T% refh (#P{  ";
		str2=str2.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str2);
		
		String str3="Hello little wo rdn lu1  27";
		str3=str3.replaceAll(" ", "");
		System.out.println(str3);
		
		String str4="Java";
		str4=str4.replace("J", "g").replace("a", "F").toUpperCase();
		
		System.out.println(str4);

	}

}
