package com.syntax.class16;

public class LargestArray {

//	int getLargestNumber(int[] array) {
//		int largest = array[0];
//		for (int i = 1; i < array.length; i++) {
//			if (array[i] > largest) {
//				largest = array[i];
//			}
//		}
//
//		return largest;
//	}

	String[] word(String str) {
		String[] array = str.split(" ");

		return array;
	}

	public static void main(String[] args) {
		LargestArray obj = new LargestArray();

		String myString = "It is a beautiful word";
		String[] array = obj.word(myString);

		for (String word1 : array) {
			System.out.println(word1);
		}
	}

}
