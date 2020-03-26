package com.syntax.class17;

public class Task01 {
	
	//Create a method that will accept an array as parameters 
	//and will return a sum of all elements from that array. 
	//Method should be visibly only within same package 
	//and accessible by the creating an instance of the class.
	
	int[] first = { 10, 20, 30, 40, 50 };
	int sum = 0;

	protected int array() {
		for (int a = 0; a < first.length; a++) {
			
			sum += first[a];
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Task01 obj = new Task01();
		System.out.println(obj.array());
		
	}
}
