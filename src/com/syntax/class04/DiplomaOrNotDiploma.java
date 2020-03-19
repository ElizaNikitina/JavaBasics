package com.syntax.class04;

public class DiplomaOrNotDiploma {

	public static void main(String[] args) {
		
		boolean diploma = true;
	    double gpa = 3;
		
		if(diploma) {
			System.out.println("Congratulations");
			if(gpa>=3.5) {
				System.out.println("You are eligible for scholarship");
			}
			else {
				System.out.println("You should studied harder");
			}
		}
		else
			System.out.println("Suggest to get a degree");
		
	}

}
