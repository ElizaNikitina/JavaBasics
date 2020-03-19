package com.syntax.class06;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("There is any sales?");
		String sale = scan.nextLine();
		double price;
		double discount = 0;
		double finalPrice = 0;
		
		if(sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price?");
			price = scan.nextDouble();
			scan.close();
				if(price<20) {
					discount = price*0.1;
				}else if(price>20 && price<100) {
					discount = price*0.2;			
				}else if(price>=100 && price<500) {
					discount = price*0.3;					
				}else if(price>=500) {
					discount = price*0.5;					
				}
				finalPrice = price-discount;
				System.out.println("You have discount " + discount + ". And total price is " + finalPrice);
		}else{
			System.out.println("We are not going shopping");
		}
			
	}

	
}
