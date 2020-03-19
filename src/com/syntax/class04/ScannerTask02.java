package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask02 {

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);

		System.out.println("Please enter amount of loan you need");

		long b = number.nextLong();

		if (b < 200_000) {
			System.out.println("I will give you the money");
		} else {
			System.out.println("I have to reject you");

		}

	}

}
