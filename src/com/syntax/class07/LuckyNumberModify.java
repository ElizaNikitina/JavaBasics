package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberModify {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int answer = 17;
		int number;

		do {
			System.out.println("Please enter number between 1 and 20");
			number = scan.nextInt();

			if (number == answer) {
				System.out.println("Congratulation!  You won!!!");
			} else {
				System.out.println("Sorry wrong number, try one more time");
			}
		} while (answer != number);

	}

}
