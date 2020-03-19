package com.syntax.class12;

public class StringManipulation {

	public static void main(String[] args) {

		// charAt function
		String str = "Good morning student";

		char letter = str.charAt(0);
		System.out.println(letter);

		char letter5 = str.charAt(4);
		System.out.println("Letter at index 4 is " + letter5 + ".");
		// get all characters 1 by 1 from a string?
		char letters;
		for (int i = 0; i < str.length(); i++) {

			letters = str.charAt(i);
			System.out.print(letters + " ");
		}
		
		System.out.println();
		// IndexOff Function
		String name="Syntax Technologies";
		int index=name.indexOf("y");
		System.out.println(index);
		index=name.indexOf(" ");
		System.out.println(index);
		index=name.indexOf("Syntax");//indexOf работает только с одиним индексом даст только индекс для первого индекса
		System.out.println(index);
		
		index=name.indexOf("!");
		System.out.println("index of not existing character" + index);
		
		index=name.indexOf("Technologies");
		System.out.println(index);
		
		index=name.indexOf("o");
		System.out.println(index);
		
		int index2=name.indexOf("o", 2);
		System.out.println(index2);
		
	}

}
