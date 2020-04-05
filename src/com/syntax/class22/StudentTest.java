package com.syntax.class22;

public class StudentTest {
	public static void main(String[] args) {
		
		Student st = new Student();
		st.study();
		st.visitLesson();
		
		System.out.println("=======");
		
		Student syntax = new SyntaxStudent();
		syntax.study();
		syntax.visitLesson();
		
		
		
		System.out.println("=======");
		
		SyntaxStudent  syntax1 = new SyntaxStudent();
		syntax1.study();
		syntax.visitLesson();
		
	}

}
