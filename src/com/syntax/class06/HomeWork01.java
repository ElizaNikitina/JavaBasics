package com.syntax.class06;

import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two random numbers");
		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		System.out.println("Please enter what operator do you need?");
		char operator = scan.next().charAt(0);
		scan.close();
		double total = 0;
		switch (operator) {

		case '+':
			total = number1 + number2;
			break;
		case '-':
			total = number1 - number2;
			break;
		case '/':
			total = number1 / number2;
			break;
		case '*':
			total = number1 - number2;
			break;
		default:
			System.out.println("You have entered wrong operator");
		}
		if (total != 0.0) {
			System.out.println("Result of our calculation " + number1 + " " + operator + " " + number2 + " = " + total);
		}
	}
}
