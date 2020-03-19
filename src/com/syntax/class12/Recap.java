package com.syntax.class12;

public class Recap {

	public static void main(String[] args) {


		String str="";
		System.out.println(str.isEmpty());
		
		String str1=null;   //no value at all
		// System.out.println(str1.isEmpty());  NullPointerException
		
		String str2="   Good morning ";
		String str3=" studends";
		String str4="!";
		
		str2=str2.trim().concat(str3).concat(str4);
		System.out.println(str2);
		
		String str6=" Hello ";
		String str7="Syntax";
		
		str6=str6.concat(str7).trim();
		
		System.out.println(str6);

	}

}
