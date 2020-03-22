package com.syntax.class15;

public class Task01 {

	void max(int a, int b) {
		int max;
		if(a>b) {
			max=a;
			System.out.println(max);
		}else {
			max=b;
			System.out.println(max);
		}
		
	}
	
	public static void main(String[]args) {
		Task01 max1=new Task01();
		max1.max(15, 3);
		max1.max(2, 59);
		
		
	}
}
