package com.syntax.class11;

public class Task01_03 {

	public static void main(String[] args) {
		
		String sent = "Is it saturday? Is it raining? Do we have a Java Class today?";

		
		String[] array=sent.split("\\?");
		
		System.out.println(array.length);

	}

}
