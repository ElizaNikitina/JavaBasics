package com.syntax.interviewQuestions;

public class HowManyAlphaCharactersArePresentInString {

	public static void main(String[] args) {
		// Find out how many alpha characters are present in a String?
		//Find number of words in string?
		
		String name="Hello! You can check any String here";
	    
	    String alpha=name.replaceAll("[^A-za-z]", "");
	    int a=alpha.length();
	    System.out.println("The number of alpha characters is "+a);
	    
	    System.out.println("________________________________");
	    String word=name.replaceAll("[A-za-z0-9!?.,]", "");
	    int b=word.length();
	    System.out.println("The number of words is "+(b+1));
	    
	    System.out.println("________________________________");
	    String[] array = name.split(" ");
	    int words = array.length;
	    System.out.println("Total words in string " + name + " is  " + words);
		
	}

}
