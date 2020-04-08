package com.syntax.class24;

public class FileTest {
	public static void main(String[] args) {
		File PDF = new PDFFile();
		File java = new JavFile();
		File word = new WordFile();
		
		
		PDF.open();
		PDF.edit();
		PDF.close();
		
		java.open();
		java.edit();
		java.close();
		
		word.close();
		word.open();
		word.edit();
	}

}
