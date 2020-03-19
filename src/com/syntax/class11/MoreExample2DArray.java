package com.syntax.class11;

public class MoreExample2DArray {

	public static void main(String[] args) {
		String[][] professions = {
				{"QA tester", "developer", "product owner", "scram master"},
				{"math teacher", "since teacher", "esl teacher"},
				{"dentist", "surgeon"},
		};
//get element using advanced for loop
		
		
		for(String[] name:professions) {
			for(String prof:name) {
				System.out.println(prof+" ");
			}
			System.out.println(" ");
		}
	}

}
