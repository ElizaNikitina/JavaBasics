package com.syntax.class03;

public class IfCondition {

	public static void main(String[] args) {
		//Declare a number and compare if number is large
		//if number is large then 100--> my number is large
		
		System.out.println("Starting coding");
		int num = 178;
		
		if(num>100) {
			
			System.out.println("My number is large");
		}
		System.out.println("End of the program");

       System.out.println("________________________");
       
       int expectedHours = 15;
       int actualHours = 15;
       
       if(actualHours>=expectedHours) {
    	   System.out.println("We will love Java");
       }
       else {
    	   System.out.println("We will not like Java");
       }
       System.out.println("______________________");
       
       double budget = 10_000;
       double carPrice = 10_000;
       
       if(budget>carPrice) {
    	   System.out.println("I can buy new car");
       }
       else {
    	   System.out.println("I will never buy new car");
       }
       
       
       System.out.println("I am code after if conditin");
	}

}
