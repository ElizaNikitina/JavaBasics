package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter value for boolean variable");
		boolean card = scan.nextBoolean();

		if(card) {
			System.out.println("What is balance on the card");
			int balance = scan.nextInt();
			scan.close();
			if(balance>=1000) {
				System.out.println("You have to pay off imidiately");
			}else {
				System.out.println("You can spend more");
			}
		}else {
			System.out.println("We offer you our credit card");
			
		}
		
	}

}
