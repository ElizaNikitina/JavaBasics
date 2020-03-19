package com.syntax.class10;

public class Task03_Margarita {

	public static void main(String[] args) {
		String[] countries = { "USA", "France", "Germany", 
				"China", "Great Britain" };
		String[] capitals = { "Washington DC", "Paris", 
				"Berlin", "Beijing", "London" };

		for (int i = 0; i < countries.length; i++) {
			System.out.println("The capital of " + countries[i] +
					" is " + capitals[i]);
		}
		
	

	}
}