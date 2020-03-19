package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		// Split function
		
		String today="Today is my favorite Java Class";
		
		String[] array=today.split("my");
		
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today2="Today is my favorite Java Class";
		
		String[] array2=today.split("a");
		System.out.println(array2.length);
		for(int a=0; a<array2.length; a++) {
			System.out.print(array2[a]+" ");
		}
		System.out.println();
		System.out.println("===advanced looop=====");
		for(String arra:array2) {
			System.out.print(arra+" ");
		}
		
		System.out.println();
		System.out.println("=====");
		
		String today3="Today is my favorite Java";
		String[] words=today3.split(" ");
		for(int a=0; a<words.length;a++) {
			System.out.print(words[a]+" ");
			System.out.println();
			System.out.println("=====");
		}
	}

}
