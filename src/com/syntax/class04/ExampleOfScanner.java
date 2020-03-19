package com.syntax.class04;

import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" any text please");
		
		String text = scan.nextLine();
		
		System.out.println("any number please");
		
		int number = scan.nextInt();
		
	
		
		System.out.println(text);
		System.out.println(number);
		
		System.out.println("End of the program");
		
	}

}
