package com.syntax.class19;

public class Book1 {
	String book1;
	String book2;

	Book1() {

	}

	Book1(String book1, String book2) {

		this.book1 = book1;
		this.book2 = book2;

	}
	
	void BookPrint () {
		
		System.out.println(book1 + " " +book2);
	}
	
	
	
	public static void main(String[] args) {
 Book1 obj = new Book1("BBB", "DDD");
 obj.BookPrint();
	

		

	}
	
}
