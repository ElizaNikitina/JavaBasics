package com.syntax.interviewQuestions;

import java.util.Scanner;

public class givenNumberIsPrimeOrNot {

	public static void main(String[] args) {

		//Write a java program to check whether a given number is prime or not?
		
		boolean isPrime = true;
		int num;
		int num1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number");
		num = scan.nextInt();
		scan.close();

		for (int a = 2; a < num / 2; a++) {
			num1 = num % a;
			if (num1 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Number " + num + " is a prime");
		} else {
			System.out.println("Number " + num + " is not a prime");
		}

		
		
		
		int given =7;
		boolean prime = true;
		if(given>1) {
			
			for(int i=2; i<given; i++) {
				if(given%i==0) {
					prime=false;
					break;
				}
			}
		}else {
			prime=false;
		}
		System.out.println("Given number " + given + " is a prime? " + prime);
	}

}
