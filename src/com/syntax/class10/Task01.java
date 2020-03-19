package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {
		String[] animals = new String[6];
		
		animals[0] = "dog";
		animals[1] = "cat";
		animals[2] = "horse";
		animals[3] = "deer";
		animals[4] = "bear";
		animals[5] = "sheep";
		
		for(int a = 0; a<animals.length; a++) {
			System.out.print(animals[a]+" ");
		}
		System.out.println();
		System.out.println("====");
		for(String animal:animals) {
			System.out.print(animal + " ");
		}



	}

}
