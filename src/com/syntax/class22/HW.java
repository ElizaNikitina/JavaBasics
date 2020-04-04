package com.syntax.class22;

public class HW {

	private void area(int a, int b) {
		int area = a * b;
		System.out.println("The area of rectangle is " + area);
	}

	void area(int a) {
		int area=a*a;
		System.out.println("The area of square is "+area);
	}

	void area(int a, int b, int c) {
		int area=2*(a*b)+2*(a*c)+2*(b*c);
		System.out.println("The area of box is "+area);
	}

	public static void main(String[] args) {
		HW obj = new HW();
		obj.area(10, 20);
		obj.area(10);
		obj.area(10, 20, 30);
		
		
		String str = "Hello friends";
		
		System.out.println(str.substring(6));
		System.out.println(str.substring(0, 5));
	}
}