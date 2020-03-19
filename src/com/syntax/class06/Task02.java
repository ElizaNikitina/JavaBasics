package com.syntax.class06;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your country");
		String country = scan.nextLine();
		scan.close();
		String favoriteFood;
		switch(country.toLowerCase()) {
		
		case "morocco":
			favoriteFood = "cousecouse";
			break;
		case "russia":
			favoriteFood = "cake";
			break;
		default:
			favoriteFood = "unknown";
		case "afghanistan":
			favoriteFood = "Qabuli";
		case "belarus":
			favoriteFood = "Draniki";
		}
		System.out.println("Your favorite food is " + favoriteFood);
	}
}
