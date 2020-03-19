package com.syntax.class10;

public class Task01_Array2DValue_HomeWork {

	public static void main(String[] args) {
		String[][] name = {{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		
		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println(name[0][0]+" "+name[1][3]);
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][1]);
		
		System.out.println("=======");

		String[][] name1 = new String[2][4];
		name1[0][0] = "Mr";
		name1[0][1] = "Mrs";
		name1[0][2] = "Ms";
		name1[0][3] = "Miss";
		
		name1[1][0] = "Smith";
		name1[1][1] = "Jordan";
		name1[1][2] = "Jackson";
		name1[1][3] = "Obama";
		
		System.out.println(name1[0][1]+" "+name1[1][0]);
		System.out.println(name1[0][0]+" "+name1[1][3]);
		System.out.println(name1[0][2]+" "+name1[1][2]);
		System.out.println(name1[0][3]+" "+name1[1][1]);
		
		

	}

}
