package com.syntax.class08;

public class BreakOfTheLoop {

	public static void main(String[] args) {
	
		for(int i=1; i<=10; i++) {
			if(i==4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of loop");
		
		for(int x=1; x<=10; x++) {
			if(x==4) {
				System.out.println("I am skipping iteration");
				continue; //skip this condition
			}
			System.out.println("I am outside of loop");
			System.out.println(x);
		}
		
		
		

	}

}
