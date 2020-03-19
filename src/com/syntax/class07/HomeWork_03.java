package com.syntax.class07;

public class HomeWork_03 {

	public static void main(String[] args) {
		
		int x = 20;
		while(x>=1) {
			System.out.println(x);
			x-=2;
		}
		
		System.out.println("======");
		
		int y = 20;
		while(y>=1) {
			if(y%2==0) {
				System.out.println(y);
			}
			y--;
		}
		
		System.out.println("======");
		
		for(int z=20; z>=1; z-=2) {
			System.out.println(z);
		}

	}
}
