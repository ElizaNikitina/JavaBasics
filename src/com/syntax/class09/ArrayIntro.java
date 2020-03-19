package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		int [] array = new int[4];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		
		//access elements from array
		System.out.println(array[1]);
		
		//second way
		
		String[] carArray;
		carArray = new String[3];
		carArray[0] = "BMW";
		carArray[1] = "Honda";
		carArray[2] = "Toyota";
		
		//I am driving Toyota
		System.out.println("I am driving " + carArray[2]);
		
		int [] numbers=new int[3];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300; 
		//change value of number[1]
		numbers[1] = 2000;
		System.out.println(numbers[1]+numbers[0]);

	}

}
