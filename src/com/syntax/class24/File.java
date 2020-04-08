package com.syntax.class24;

public abstract class File {
	
	public abstract void open();
	public void edit() {
		System.out.println("method edit");
	}
	public void close() {
		System.out.println("method close");
	}

}

class JavFile extends File{

	@Override
	public void open() {
		System.out.println("to open .java file we need notepad++");		
	}

//	@Override
//	public void edit() {
//		System.out.println("to edit .java file we need Eclipse");		
//	}
//
//	@Override
//	public void close() {
//		System.out.println("to close .java file we need mouse and little brains");
//	}	
}
class WordFile extends File{

	@Override
	public void open() {
		System.out.println("to open word file we need Office");		
	}

//	@Override
//	public void edit() {
//		System.out.println("to edit word file we need Office");		
//	}
//
//	@Override
//	public void close() {
//		System.out.println("to close word file we need mouse and little brains");
//	}	
}

class PDFFile  extends File{

	@Override
	public void open() {
		System.out.println("to open PDF file we need Acrobat");		
	}

//	@Override
//	public void edit() {
//		System.out.println("to edit PDF file we need miracle");		
//	}
//
//	@Override
//	public void close() {
//		System.out.println("to close PDF file we need mouse and little brains");
//	}	
}