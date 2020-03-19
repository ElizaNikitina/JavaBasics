package com.syntax.class08;

import java.util.Scanner;

public class Task_02_Shopping {

	public static void main(String[] args) {
	

			Scanner scan = new Scanner(System.in);
			double price = 0;
			double payMoney = 0;
			String item;

			do {
				System.out.println("Please show me what you chose");
				item = scan.nextLine();
				System.out.println("The price on this item is: ");
				price = scan.nextDouble();
				System.out.println("how mush do you have?");
				payMoney = scan.nextDouble();
				
				if (price==payMoney) {
					System.out.println("Please enjoy your purchases");
					break;
				}else if(price<payMoney){
					System.out.println("Please enjoy your purchases and your change " + (payMoney-price));
					break;
				}else {
					System.out.println("You have to pay more " + (price-payMoney) );
					break;
				}
			} while (price != payMoney);  
			
			System.out.println("Thank you for shopping");

	}
	}


