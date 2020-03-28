package com.syntax.class17;

public class Task01 {

	// Create a method that will accept an array as parameters
	// and will return a sum of all elements from that array.
	// Method should be visibly only within same package
	// and accessible by the creating an instance of the class.

	protected int array(int[] array) {
		int sum = 0;
		for (int a = 0; a < array.length; a++) {

			sum += array[a];

		}
		return sum;
	}

	public static void main(String[] args) {
		Task01 obj = new Task01();
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(obj.array(a));

	}
}
