package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		
		boolean quizDone = true;
		
		
		int score = 86;
		
		if(quizDone) {
			System.out.println("Let`s check your score");
			if(score>90) {
				System.out.println("Great job");
			}
			else if(score>80) {
				System.out.println("Well done");
			}
			else if(score>70) {
				System.out.println("You could done better");
			}
			else {
				System.out.println("You failed");
			}
		}
		else {
			System.out.println("Please do your HW on time");
		}
		
		
		
	}

}
