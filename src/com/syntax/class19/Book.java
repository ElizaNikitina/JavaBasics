package com.syntax.class19;

public class Book {
	
	String author;
	String name;
	int year;
	
	 Book(String author, String name, int year){
		this.author = author;
		this.name = name;
		 this.year = year;
		 System.out.println("author is "+ author + " book is " + name + " was written " + year + " year");
	}
	 
	 Book(String rating){
		 this("King", "IT", 1985);
		 System.out.println("You have to read this book to create the raiting");
		 
	 }
	
	public static void main(String[] args) {
		
		Book obj = new Book("B");
	}

}
