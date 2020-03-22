package com.syntax.class15;

public class Methods {
	
	//cteate a method that will say welcome 10 times
	
	void sayWelcome() {
		for(int a=0; a<5;a++) {
			System.out.println("Welcome");
		}
	}
	
	//create a method will say any word of time
	
	void sayAnyWord(String word, int a) {
		for(int b=0; b<a; b++) {
			System.out.println(word);
		}
	}
	
	//create the method will accept boolean as a parameter
	//isItRaining
	void isItRaining (boolean a) {
		if(a) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Sun");
		}
	}
	
	public static void main(String[]args) {
		
		Methods m1=new Methods();
		m1.sayWelcome();
		System.out.println("=====");
		m1.sayAnyWord("Don`t know",2);
		System.out.println("=====");
		m1.isItRaining(true);
		System.out.println("=====");
		m1.isItRaining(false);
		
	}

}
