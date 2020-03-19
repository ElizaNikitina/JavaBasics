package com.syntax.class08;

public class OddsAndEven {

	public static void main(String[] args) {
		int x;
		int sum = 0;
		int sum1 = 0;
		for (x = 1; x <= 100; x++) {
			if (x % 2 == 0) {
				sum += x;
			} else {
				sum1 += x;
			}
		}
		System.out.println("total evens " + sum);
		System.out.println("total odds " + sum1);
	}

}
