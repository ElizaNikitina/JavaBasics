package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("How mauch your sales are?");
			double sales = scan.nextDouble();
			scan.close();
			if(sales>1&&sales<100) {
				System.out.println("Yor comission should be " + (sales*0.10) + ". This is 10% comission");
			}else if(sales>100&&sales<=200) {
				System.out.println("Yor comission should be " + (sales*0.20) + ". This is 20% comission");
			}else if(sales>200&&sales<=500) {
				System.out.println("Yor comission should be " + (sales*0.30) + ". This is 30% comission");
			}else if(sales>500) {
				System.out.println("Yor comission should be " + (sales*0.50) + ". This is 50% comission");
			}
			

	}

}
