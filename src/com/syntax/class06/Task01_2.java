package com.syntax.class06;

import java.util.Scanner;

public class Task01_2 {
	public static void main(String[] args) {
		   
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your grade");
		char grade = scan.next().charAt(0);
		scan.close();
		String explanation;
		
		switch(grade) {
		
		case'A':
			explanation = "Excellent";
			break;
		case'B':
			explanation = "Good";
			break;
		case'C':
			explanation = "Average";
			break;
		default:
			explanation = "Not Acceptable";
		}
		System.out.println("Your grade is " + grade + " and it is " + explanation);

}
}