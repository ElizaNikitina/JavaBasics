package com.syntax.class09;

public class Clock {

	public static void main(String[] args) {

		for (int a = 0; a <= 23; a++) {

			for (int b = 0; b <= 59; b++) {
				 if (b < 10) {
					System.out.println(a + ":0" + b);
				} else {
					System.out.println(a + ":" + b);
				}

			}
			System.out.println(" ");
		}

	}
}
