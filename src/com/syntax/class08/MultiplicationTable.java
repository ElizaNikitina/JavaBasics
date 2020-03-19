package com.syntax.class08;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int x,y;
		for(y=1, x=1;x<=10; x++) {
			System.out.println(y + " * " + x + " = " + y*x );
			if(x==10 && y<10) {
				System.out.println();
				x=0;
				y++;
			}
		}
		System.out.println("==========");
		
		int num = 4;
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " + i * num);
		}
		
		System.out.println("==========");
		
		int num1 = x;
		int num2 = y;
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " + i * num);
		}
		
	}

}
