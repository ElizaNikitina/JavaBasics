package com.syntax.class05;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter three random numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		int large;
	
		if(a>0 && b>0 && c>0) {
			if(a>b && a>c) {
				large = a;
			}else if(b>a && b>c) {
				large = b;
			}else {
				large = c;
			}
			System.out.println("The largest number is " + large);
		}else{
			System.out.println("I don`t wanna compare negative numbers");
		}
	
	}

}
