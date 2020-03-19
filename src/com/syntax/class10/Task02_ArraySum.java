package com.syntax.class10;

public class Task02_ArraySum {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for(int b=0; b<numbers.length; b++ ) {
			sum=sum+numbers[b];
		}
		System.out.println(sum);
		
		int sum1=0;
		for(int number:numbers) {
			sum1 = sum1+ number;
		}
		System.out.println(sum1);
		

	}

}
