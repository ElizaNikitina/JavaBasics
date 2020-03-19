package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		System.out.println("Please enter your age");
		
		String name = scan.nextLine();
		int age = scan.nextInt();
		
		System.out.println("My mane is " + name + " and my age is " + age);
		
	}

}
