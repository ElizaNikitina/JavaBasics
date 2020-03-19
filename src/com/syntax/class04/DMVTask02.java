package com.syntax.class04;

import java.util.Scanner;

public class DMVTask02 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);

		System.out.println("Please enter your age");

		int age = number.nextInt();
		
		if(age>18) {
			System.out.println("Please, this is your licence");
		}else {
			System.out.println("Please, take your lerning permit");
		}
	}

}
