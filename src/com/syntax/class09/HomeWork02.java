package com.syntax.class09;

public class HomeWork02 {

	public static void main(String[] args) {
		/*Create an array of names and 
		 * store all names of your group. 
		 * Then print your name from that array.
		 * (use 2 different ways of creating an array). 
		 */
		String[] names = new String[7];
		names[0] = "Eliza Nikitina";
		names[1] = "Andrei Shelekhov";
		names[2] = "Andrei Tatusko";
		names[3] = "Anton Sukhoterin";
		names[4] = "Margarita Malivannikova";
		names[5] = "Pavel Asiyeuski";
		names[6] = "Valery Tsybulka";
		
		System.out.println(names[0]);
		System.out.println("=====");
		
		String[] names1 = {"Eliza Nikitina", "Andrei Shelekhov", 
				"Andrei Tatusko", "Anton Sukhoterin", 
				"Margarita Malivannikova", "Pavel Asiyeuski", "Valery Tsybulka"};
		System.out.println(names[0]);
		
	}

}
