package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		//check if patient has any allergies
		//
		
		
		boolean allergy = true;
		//boolean noAllergy = false;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = true;
		
		if(allergy) {
			System.out.println("Please answer below");
			if(orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
			if(kiwiAllergy) {
				System.out.println("Do not eat kiwis");
			}
		}
		else {
			System.out.println("You are healthy");
		}

	}

}
