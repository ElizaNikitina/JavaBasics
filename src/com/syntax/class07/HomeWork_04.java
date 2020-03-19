package com.syntax.class07;

public class HomeWork_04 {

	public static void main(String[] args) {

		int x = 20;
		while (x < 50) {
			System.out.println(x + 1);
			x += 2;
		}
		System.out.println("=====");

		int y = 20;
		while (y < 50) {
			if (y % 2 != 0) {
				System.out.println(y);
			}
			y++;
		}
		
		System.out.println("=====");
		
		for(int z=20; z<50; z+=2) {
			System.out.println(z+1);
		}
	}

}
