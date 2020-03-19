package com.syntax.class12;

import java.util.Scanner;

public class StringTask02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		
		if(!(name.isEmpty())){
			if(name.length()%2==1 && name.length()>=3) {
			
					System.out.println(name.charAt((name.length()/2)));
				
			}else {
				System.out.println("Even number of charachtes");
			}
			
		}else {
			System.out.println("You cannot have empty String");
		}
	}

}
