package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask01 {
	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);

		System.out.println("Please enter two munbers");
		int b = number.nextInt();
		int c = number.nextInt();

		if (b > c) {
			System.out.println(b + " is a large then " + c);
		} else if (b == c) {
			System.out.println(b + " is equal to " + c);
		} else {
			System.out.println(c + " is a large then " + b);
		}

	}
}
