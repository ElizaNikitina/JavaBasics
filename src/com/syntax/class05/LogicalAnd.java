package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		System.out.println("Please enter a number");
		int b = number.nextInt();
		number.close();
		
		if(b>1 && b<10) {
			System.out.println("This number is small");
		}else if(b>11&&b<100) {
			System.out.println("This is big number");
		}else if(b>101&&b<1000) {
			System.out.println("This is large number");

	}else {
		System.out.println("Number is super large");
	}
	}
}
