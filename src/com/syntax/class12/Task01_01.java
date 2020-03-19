package com.syntax.class12;

import java.util.Scanner;

public class Task01_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please create any sentense");
		String sentense=scan.nextLine();
		
		String[] newSent=sentense.split(" ");
		
		for(int a=0; a<newSent.length; a++) {
			System.out.print(newSent[a]);
		}

	}

}
