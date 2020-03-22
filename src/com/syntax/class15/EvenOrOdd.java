package com.syntax.class15;

public class EvenOrOdd {

	void evenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		EvenOrOdd num = new EvenOrOdd();
		num.evenOrOdd(15);
		num.evenOrOdd(16);


	}
}