package com.syntax.class15;

public class MethodsReturnValue {

	public static void main(String[] args) {

		// create a String and based on the length of the String
		// we define whether String is short or long

		String str = "Hello my friend";

		int length = str.length();

		if (length > 10) {
			System.out.println("String is long");
		} else {
			System.out.println("String is short");
		}

		// compare two numbers and then we identify whether largest number even or odd

		Task01 max2 = new Task01();
//		int num = max2.max(15, 2); CE since isLargest does not return any value

		MethodsReturnValue max3 = new MethodsReturnValue();

		int num = max3.largest(10, 16);
		System.out.println(num);
		boolean a=max3.isOdd(num);
		System.out.println("Largest number is " + num + " is odd number " + a);

	}

	// create a method that returns largest number from two given numbers

	int largest(int a, int b) {
		int largest;
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}

	boolean isOdd(int num) {
		boolean isOdd;
			if (num % 2 == 0) {
				isOdd=false; 
						} else {
				isOdd=true;
			}
			return isOdd;
		}

}
