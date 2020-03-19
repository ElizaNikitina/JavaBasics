package com.syntax.class11;

import java.util.Scanner;

public class TaskString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username");

		String username = scan.nextLine();

		System.out.println("Please enter your password");
		String password = scan.nextLine();
		String confirmPassowd = password;

		boolean empty = username.isEmpty();
		boolean empty1 = password.isEmpty();

		if (empty || empty1) {
			System.out.println("Password cannot be empty");
			if (password.length() < 8) {
				System.out.println("password cannot be less then 8 characters");
				if (password.equalsIgnoreCase(username)) {
					System.out.println("Password cannot contain username");
					if (password.equals(confirmPassowd)) {
						System.out.println("Password is correct");
					}
				}

			}else {
				System.out.println("please chek your password");
			}

		}

		System.out.println("Your username and password has been created");

	}

}
