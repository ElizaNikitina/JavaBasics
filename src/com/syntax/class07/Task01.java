package com.syntax.class07;

public class Task01 {

	public static void main(String[] args) {

		boolean workDay = true;
		int x = 1;
		while (workDay) {
			if (x < 6) {
				System.out.println("I need a day off");
			} else {
				System.out.println("I do not need a day off any more");
				workDay = false;
			}
			x++;

		}

	}
}