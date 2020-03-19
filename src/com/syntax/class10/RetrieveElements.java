package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {

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
		
		//create an arry of fruits and retrieve all elements
		System.out.println();
		System.out.println("-------printing using advanced for loop------");
		
		String[] fruits= {"Banana", "Kiwi", "Apple", "Mango"};
		for(String fruit:fruits) {	
			if(fruit==fruits[2]) {//(fruit.equals("Apple")
				System.out.println(fruit + " That is your favorite fruite ");
			}else {
				System.out.println(fruit+ " ");
			}
		}
		System.out.println();
		System.out.println("====");
		for(int a=0;a<fruits.length; a++) {
			System.out.print(fruits[a]+" ");
		}

	}

}
