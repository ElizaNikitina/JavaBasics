package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int lucky = 17;
		while (!(num == lucky)) {
			System.out.println("What is your mumber");
			num = scan.nextInt();
		}
		if (num == lucky) {

			System.out.println("Congrat you winn");

		}

	}
}
