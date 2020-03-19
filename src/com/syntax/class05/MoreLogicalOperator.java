package com.syntax.class05;

import java.util.Scanner;

public class MoreLogicalOperator {

//			System.out.println("Please enter a number");
//			int b = number.nextInt();
//			
//			if(b==2 || b==3) {
//				System.out.println("Today is SDLC Class");
//			}else if(b==6||b==7) {
//				System.out.println("Today is Java class");
//			}else if(b==4) {
//				System.out.println("Today is Java review class");
//		    }else if(b==5|| b==1) {
//		    	System.out.println("Today is no class");
//		    }
//			else {
//			System.out.println("Invalid day");
//		}

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		System.out.println("Please enter a Day");
		String day = number.nextLine();
		number.close();

		if (day.equals("Tuesdau") || day.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today is Java class");
		} else if (day.equals("Thursday")) {
			System.out.println("Today is Java review class");
		} else if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today is no class");
		} else {
			System.out.println("Invalid day");
		}
	}
}
