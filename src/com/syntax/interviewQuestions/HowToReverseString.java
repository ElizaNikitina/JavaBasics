package com.syntax.interviewQuestions;

public class HowToReverseString {

	public static void main(String[] args) {
		// Write a java program to reverse String?
		// Reverse a string word by word?

		String str = "Greatest Of All Time";
		System.out.println(str);
		// reverse whole string:
		for (int i = str.length() - 1; i >= 0; i--) {
			
			System.out.print(str.charAt(i));
		}
		System.out.println(" ");
		System.out.println("=============");
		// reverse words:
	

		System.out.println(str);
		String[] f = str.split(" ");
		for (int i = 0; i < f.length; i++) {
			for (int j = f[i].length() - 1; j >= 0; j--) {
				System.out.print(f[i].charAt(j));
			}
			System.out.print(" ");
			
		}
		System.out.println(" ");
		System.out.println("=====================");

		// Reverse String character by character

		String given = "I love Java";
		String reversed = "";
		for (int i = given.length() - 1; i >= 0; i--) {
			reversed = reversed + given.charAt(i);
		}
		System.out.println(given);
		System.out.println("Reversed String = " + reversed);

	}

}
