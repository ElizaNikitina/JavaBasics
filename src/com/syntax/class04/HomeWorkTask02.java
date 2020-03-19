package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter numbers of worked years");
		int workedYears = scan.nextInt();
		System.out.println("Enter anual salary");
		 int annualSalary = scan.nextInt();
		 scan.close();
		 if(workedYears>=5) {
			 System.out.println("You eligile for the bonus");
			 if(annualSalary>=50000) {
				 System.out.println("Your bonus is 5000");
			 }else {
				 System.out.println("Your bonus is 3000");
			 }
		 }else {
			 System.out.println("Sorry you worked not enough");
		 }
		 

	}
}
