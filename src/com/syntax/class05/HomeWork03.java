package com.syntax.class05;


import java.util.Scanner;

public class HomeWork03 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter three random numbers");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		scan.close();
		double large;
		if (a >= b && a >= c) {
			large = a;
		} else if (b >= a && b >= c) {
			large = b;
		} else {
			large = c;
		}
		System.out.println("The largest number is " + large);
	}
}
