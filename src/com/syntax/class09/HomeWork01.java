package com.syntax.class09;

public class HomeWork01 {

	public static void main(String[] args) {
		//Create an array of chars and store grades 
		//into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways 
		//of creating an array).
		
			char[] grades = new char[6];
			grades[0] = 'A';
			grades[1] = 'B';
			grades[2] = 'C';
			grades[3] = 'D';
			grades[4] = 'E';
			grades[5] = 'F';
			
			System.out.println(grades[1]);
			
			System.out.println("=======");
			
			char[] grades1 = {'A', 'B','C', 'D', 'E', 'F'};
			System.out.println(grades1[1]);
			
			
			for(int a=0; a<grades.length; a++) {
				System.out.print(grades[a]+ " ");
			}
			System.out.println();
			System.out.println("-------printing using advanced for loop------");
			
			// each for loop
			
			for(char gradeNew:grades) {
				System.out.print(gradeNew + " ");
			}
			
			//
		}
		
		
	}


