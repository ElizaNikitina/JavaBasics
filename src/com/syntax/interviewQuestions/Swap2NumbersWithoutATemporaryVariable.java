package com.syntax.interviewQuestions;

public class Swap2NumbersWithoutATemporaryVariable {

	public static void main(String[] args) {
		
		//Write a program to swap 2 numbers without a temporary variable? 
		//Swap 2 strings without a temporary variable?

		int a = 10, b = 20;
		a+= b;
		b = a - b;
		a = a - b;
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
		
		String word1 = "First";
		String word2 = "Second";
		
		
		int w1 = word1.length();
		word1 = word1 + word2;
		
		word2 = word1.substring(0, w1);
		word1 = word1.substring(w1);
		System.out.println("Word1 = " + word1);
		System.out.println("Word2 = " + word2);
		
//		String str1 = "Day";
//		String str2 = "Night";
//		
//		str1= str1+str2; //DayNight
//		str2=str1.substring(0, 3); //Day
//		str1=str1.substring(3); //Night
//		
//		
//		System.out.println("The value of Day is " + str1);
//		System.out.println("The value of Night is " + str2);
		
		String str1 = "Syntax";
		String str2 = "Technologies";
		
		str1= str1+str2; //DayNight-->8
		str2=str1.substring(0, str1.length()-str2.length()); //Day
		str1=str1.substring(str2.length()); //Night
		
		
		System.out.println("The value of Day is " + str1);
		System.out.println("The value of Night is " + str2);
		
		
		
	}

}
