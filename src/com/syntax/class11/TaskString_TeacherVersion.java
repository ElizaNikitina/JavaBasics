package com.syntax.class11;

import java.util.Scanner;

public class TaskString_TeacherVersion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your username");

		String username = scan.nextLine();

		System.out.println("Please enter your password");
		String password = scan.nextLine();
		String confirmPassowd;
		String message = null;

		if (!(username.isEmpty() || password.isEmpty())) {

			if (password.length() >= 8) {

				if (!password.contains(username)) {
					System.out.println("Please confirm password");
					confirmPassowd = scan.nextLine();
					if (password.contentEquals(confirmPassowd)) {
						System.out.println("Your username and password has been created");
					} else {
						System.out.println("Passwod are not matched");
					}
				} else {
					System.out.println("Password cannot contain username");
				}

			} else {
				System.out.println("Password is too short");
			}

		} else {
			System.out.println("Username and password cannot be empty");
		}

	}

}
