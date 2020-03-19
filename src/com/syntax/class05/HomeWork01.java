package com.syntax.class05;

import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double average;
		String grade = null;
		System.out.println("Please enter your quiz score:");
		double quiz = scan.nextDouble();
		System.out.println("Please enter your mid term score:");
		double midTerm = scan.nextDouble();
		System.out.println("Please enter your final1 score:");
		double final1 = scan.nextDouble();
		average = (quiz+midTerm+final1)/3;
		scan.close();
		if(average>=90) {
			grade = "A";
		}else if(average>=70 && average<90) {
			grade = "B";
		}else if(average>=50 && average<70) {
			grade = "C";
		}else if(average<50) {
			grade = "F";
		}else {
			System.out.println("your number invalid");
		}
		System.out.println("Your average score is " + grade);
	}

}
