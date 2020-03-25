package com.syntax.class16;

import com.syntax.class15.Task01;

public class Largest {

	int max(int a, int b) {
		int max;
		if (a > b) {
			max = a;
			System.out.println(max);
		} else {
			max = b;
			System.out.println(max);
		}
		return max;
	}

	public static void main(String[] args) {
		Largest max1 = new Largest();
		max1.max(15, 3);
		max1.max(2, 59);

	}
}
