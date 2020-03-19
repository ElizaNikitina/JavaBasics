package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		int[] grade = new int[4];
		
		grade[0] = 90;
		grade[1] = 67;
		grade[2] = 89;
		grade[3] = 78;
		
		int average = (grade[0]+grade[1]+grade[2]+grade[3])/4;
		System.out.println(average);
		System.out.println("=================");
		
		String[] cities = {"Washington", "New York", "Paris", 
				"Miami", "Los Angales", "Dallas", "Chantilly"};
		
		//I live in Paris
		
		System.out.println("I live in " + cities[2]);
		int x=1;
		System.out.println(cities[x]);
		x+=2;
		System.out.println(cities[x]);
		
		int arraySize=cities.length;
		System.out.println("Total elements " + arraySize);
		
		System.out.println(cities[arraySize-1]);
		System.out.println("*******");
		
		for(int a=0; a<arraySize; a++) {
			System.out.println(cities[a]);
		}
		
		
		

	}

}
