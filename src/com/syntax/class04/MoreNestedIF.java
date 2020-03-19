package com.syntax.class04;

public class MoreNestedIF {

	public static void main(String[] args) {
		//declare date and day
		//if day is Friday -->if date is 13-->watch a scary movie
		//                 -->if date is not 13 --> watch comedy
		
		
		
		boolean isFriday = false;
		int date = 13;
		
		if(isFriday) {
			System.out.println("Today is Friday, I am going to a movie");
		    if(date==13) {
		    	System.out.println("I`ll watch a scary movie");
		    }
		    else {
		    	System.out.println("I`ll watch a comedy");
		    }
		}
		else {
			System.out.println("Today is not Friday, I am staying home");
		}
	}

}
