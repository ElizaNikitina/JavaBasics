package com.syntax.class15;

public class CreatingMethod {

	//create a method  that will accept marks and base on it will return grade
	
	
	String grade (int a) {
		String b = null;
		if(a>90) {
			b = "A";
		}else if(a<=90 && a>80) {
			b= "B";
		}else if(a<=80 && a>70) {
			b="C";
		}else {
			b="F";
		}
		return b;
	}
	public static void main(String[] args) {
		CreatingMethod num = new CreatingMethod();
		
		String c = num.grade(75);
		System.out.println(c);
//		c = num.grade(82);
//		System.out.println(c);
//		c = num.grade(90);
//		System.out.println(c);
//		
		if(c.equals("A") || c.equals("B")) {
			System.out.println("Good job");
		}else {
			System.out.println("Please study more");
		}
		
		
	}
}
