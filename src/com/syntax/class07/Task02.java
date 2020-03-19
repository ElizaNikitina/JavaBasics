package com.syntax.class07;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		int num = 1;
		try (Scanner scan = new Scanner (System.in)) {
			while(num<=5) {
				
			System.out.println("What is your name");
			String name = scan.nextLine();
			
			System.out.println("Good afternoon "+ name);

				num++;
			}
		}
	}

}
