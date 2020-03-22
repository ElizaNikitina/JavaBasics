package com.syntax.interviewQuestions;

public class PalindromOrNoPalindrome {
	// Write a Java Program to find whether a String is palindrome or not?
		public static void main(String[] args) {
			
			String str = "never odd or even";

			// 1st way
			char[] charArray = str.toCharArray();
	
			String reverse = "";
			System.out.println(reverse.isEmpty());

			for (int i = charArray.length - 1; i >= 0; i--) {
				reverse += charArray[i];
			}
			System.out.println("word is=" + str);
			System.out.println("reverse is=" + reverse);
			
			if(str.equals(reverse)) {
				System.out.println("Yes, it is a palindrome");
			}else {
				System.out.println("No, it is not a palindrome");
			}
			
			//HW use charAt() method to find if it is a palindrome
		}
	}




