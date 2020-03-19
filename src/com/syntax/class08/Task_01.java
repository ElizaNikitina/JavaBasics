package com.syntax.class08;

public class Task_01 {
	public static void main(String[] args) {
		
		for(int y=1; y<=50; y++) {
			if(y%3==0) {
				continue;
			}
			System.out.println(y);
		}
	}

}
