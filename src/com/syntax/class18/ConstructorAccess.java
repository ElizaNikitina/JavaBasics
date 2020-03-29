package com.syntax.class18;

public class ConstructorAccess {
	

		static String str = "Hello";

		ConstructorAccess() {
			System.out.println("I am default constructor");
		}

		protected  ConstructorAccess(String a) {
			System.out.println("I am a protected constructor");
		}
		
		private ConstructorAccess(int b) {
			System.out.println("I am a private constructor");
		}

		
		public ConstructorAccess(String a, int b) {
		System.out.println("I am a public constructor");
		}

		public static void main(String[] args) {

			// Constructor obj = new Constructor();

			System.out.println(str);
			new Constructor();

			ConstructorAccess demo = new ConstructorAccess(2);
			ConstructorAccess demo1 = new ConstructorAccess("Eliza",2);
			ConstructorAccess demo2 = new ConstructorAccess("Eliza");
		}
	}


