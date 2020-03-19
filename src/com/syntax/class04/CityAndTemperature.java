package com.syntax.class04;

import java.util.Scanner;

public class CityAndTemperature {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your city");
		
		String city = scan.nextLine();
		
		System.out.println("Please enter teperature in your city in F");
		
		double F = scan.nextInt();
		
		System.out.println("Temperature in the city " + city +" in celsius degree is " + ((F-32)*0.55));
	
	}
	

}
