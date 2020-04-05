package com.syntax.class22;

public class Student {
	
	public void visitLesson() {
		System.out.println("All students visit lessons");
	}

	public void study() {
		System.out.println("All students study");
	}
}

class SyntaxStudent extends Student {
	public void study() {
		System.out.println("Syntax students study Java");
	}
	public void useJava() {
		System.out.println("Syntax students use Java");
	}
}

class CollegeStudent extends Student {
	public void study() {
		System.out.println("College students study Law");
	}
}

class SchoolStudent extends Student {
	public void study() {
		System.out.println("School students study Math");
	}
}


