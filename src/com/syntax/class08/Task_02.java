package com.syntax.class08;

import java.util.Scanner;

public class Task_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String decision = null;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Please apply credit card");
			System.out.println("What is your decision?");
			decision = scan.nextLine();
			if (decision.equalsIgnoreCase("Yes")) {
				System.out.println("Congrat! you apply credit card");
				break;
			}

		}

	}
}