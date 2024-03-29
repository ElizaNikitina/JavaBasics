package com.syntax.interviewQuestions;

public class FindTheSecondLargestNumberInTheArray {

	public static void main(String[] args) {
//		int[] numbers = { 32, 61, 16, 89, 74, 25 };
//		// 1st way
//		Arrays.sort(numbers);
//		System.out.println("Smallest " + numbers[0]);
//		System.out.println("Biggest " + numbers[numbers.length - 1]);
//		System.out.println("Second Largest " + numbers[numbers.length - 2]);
		
		
		// 2nd way
		System.out.println("---2nd way---");
		int[] numbers2 = {110, 89, 32, 61, 16, 89, 74, 89, 25, 89, 110, -110 };
		
		int smallest = numbers2[0];
		int largest = 0;
		int largest2 = 0;
		for (int i = 0; i < numbers2.length; i++) {
			int element = numbers2[i];
			// check if it is bigger than the largest
			if (element > largest) {
				largest2 = largest;
				largest = element;
			} else if (element > largest2 && element!=largest) { // check if it is bigger than second largest
				largest2 = element;
			}
			if (element < smallest) {
				smallest = element;
			}
		}
		System.out.println("Smallest " + smallest);
		System.out.println("Biggest " + largest);
		System.out.println("Second Largest " + largest2);

	}

}
