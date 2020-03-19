package com.syntax.class05;

import java.util.Scanner;

public class PersonHeights {

		public static void main(String[] args) {
			Scanner number = new Scanner(System.in);

			System.out.println("Please enter your height in inch");
			int height = number.nextInt();
			number.close();
			if(height<60) {
				System.out.println("Your height is short");
			}else if(height>=60&&height<72) {
				System.out.println("Your height is medium");			
			}else if(height>=72) {
				System.out.println("Your height is tall");
			}
	}

}
