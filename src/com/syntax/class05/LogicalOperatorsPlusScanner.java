package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorsPlusScanner {

		public static void main(String[] args) {
			Scanner number = new Scanner(System.in);

			System.out.println("Please enter your age");
			int age = number.nextInt();
			number.close();
			
			if(age>=0) {
				if(age<=3) {
				System.out.println("You are baby");
			}else if(age>=4&&age<=5) {
				System.out.println("You are a kid");
			}else if(age>=6&&age<=12) {
				System.out.println("You are a child");
			}else if(age>=13&&age<=19) {
				System.out.println("You are a teenage");
			}else if(age>=20&&age<=64) {
				System.out.println("You are an adult");
			}else{
				System.out.println("You are enjoying your life");
			}
			}else {
				System.out.println("Please enter valid age");
			}
	}

}
