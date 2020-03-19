package com.syntax.class08;

import java.util.Scanner;

public class Task_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		int sumEven = 0;
		int sumOdd = 0;
		System.out.println("Please enter first number");
		x = scan.nextInt();
		System.out.println("Please enter second number");
		y = scan.nextInt();
		for (; x <= y; x++) {
			if (x % 2 == 0) {
				sumEven += x;
			} else {
				sumOdd += x;
			}

		}
		System.out.println(sumEven);
		System.out.println(sumOdd);

	}
}
