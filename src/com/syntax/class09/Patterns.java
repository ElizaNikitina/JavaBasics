package com.syntax.class09;

public class Patterns {

	public static void main(String[] args) {
//	    for (int a = 1; a <= 5; a++) {
//			System.out.println("*");
//			}
//		for (int a = 1; a <= 5; a++) {
//			System.out.print("*");
//			}
//		for (int a = 1; a <= 5; a++) {
//			System.out.println("*");
//			}
//		for (int a = 1; a <= 5; a++) {
//			System.out.print("*");
//			}
		
		System.out.println("===");
		for(int a=1; a<=4; a++) {
			for (int b=1; b<=5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===");
		
		for(int a=1; a<=10; a++) {
			for (int b=1; b<=10; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===");
		for(int a=1; a<=5; a++) {
			for (int b=1; b<=10; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===");
		for(int a=1; a<=5; a++) {
			for (int b=1; b<=5; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		System.out.println("===");
		for(int a=1; a<=5; a++) {
			for (int b=1; b<=5; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("===");
		for(int a=1; a<=5; a++) {
			for (int b=1; b<=9; b++) {
				if(b==7) {
					continue;
				}
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println("===");
		
		for(int a=1; a<=5; a++) {
            for (int b=5; b>=1; b--) {
                System.out.print(b);
            }
            System.out.println();
        }
		System.out.println("===");

		for(int a=5; a>=1; a--) {
			for (int b=5; b>=1; b--) {
				System.out.print(a);
			}
			System.out.println();
		}
		
		System.out.println("===");

		for(int a=1; a<=4; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}
}

