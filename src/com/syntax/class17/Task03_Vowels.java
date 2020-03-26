package com.syntax.class17;

public class Task03_Vowels {

	// Create a method that will accept a String as a parameter
	// and return a new String that consist only of vowels.
	// Method should be available inside the class where it was declared
	// and executed by calling it is name.



	private String showVowels(String newString) {
		for(int k = 0; k <newString.length();k++) {
			newString = newString.replaceAll("[BCDFGHJKLMNPQRSTVWXZbcdfghjklmnpqrstvwxz]","");
	}
		return newString;
	}

	public static void main(String[] args) {
		Task03_Vowels obj = new Task03_Vowels();
		System.out.println(obj.showVowels("Manipulation"));
	}
}
