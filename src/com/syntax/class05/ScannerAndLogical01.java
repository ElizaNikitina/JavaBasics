package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical01 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("How much your sales are?");
			double sales = scan.nextDouble();
			scan.close();
			double comission;
			
			if(sales>=1&&sales<=100){
				comission=sales*0.1;
			}else if(sales>100 && sales<=200){
				comission=sales*0.2;
			}else if(sales>200 && sales<=500){
				comission=sales*0.3;
			}else {
				comission=sales*0.5;
			}
			
				System.out.println("Yor comission should be " + comission);
			if(comission>100) {
				System.out.println("You are an awesome seller");
			}

	
		}
}
