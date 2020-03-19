package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double price;

		do {
			System.out.println("Please pay for a candy");
			price = scan.nextDouble();
			if (price == 2) {
				System.out.println("Enjoy your candy");
			} else if(price>2){
				System.out.println("Please enjoy your candy and your change " + (price-2));
			}else {
				System.out.println("I need more money");
			}
		} while (price != 2);

		System.out.println("==============");

		while (price != 2) {
		       System.out.println("Please pay for a candy");
		       price = scan.nextDouble();
		}
		System.out.println("Enjoy your candy");       
	}

}
