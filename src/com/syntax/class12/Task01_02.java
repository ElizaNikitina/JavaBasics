package com.syntax.class12;

import java.util.Scanner;

public class Task01_02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please create any sentense");
		String sentense=scan.nextLine();
		
		sentense=sentense.replaceAll("[A-Za-z]", "1");
		System.out.println(sentense.length());
		
		
	}

}
