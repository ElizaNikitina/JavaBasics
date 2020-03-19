package com.syntax.class12;

import java.util.Scanner;

public class StringTask03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter mother name: ");
		String motherName=scan.nextLine();
		System.out.println("Please enter father name: ");
		String fatherName=scan.nextLine();
		System.out.println("Please enter expecting gender of baby boy or girl?");
		String gender=scan.nextLine();
		
		
		if(gender.equals("girl")) {
			int lit=(fatherName.length())/2;
			
			String girl=motherName.substring(0, 2)+fatherName.substring(lit);
			
			System.out.println(girl);
		}else {
			int lit2=(motherName.length())/2;
			
			String boy=fatherName.substring(0, 2)+motherName.substring(lit2);
			System.out.println(boy);

		}
		
		System.out.println("What is amasing name!");
		
		
	}

}
