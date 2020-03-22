package com.syntax.class15;

public class Hello {
	
	void sayHello(String a) {
		
		if(a.equals("Russia")) {
			System.out.println("Privet");
		}else if(a.equals("USA")) {
			System.out.println("Hello");
		}else if(a.equals("Spain")) {
			System.out.println("Ola");
		}else if(a.equals("Poland")) {
			System.out.println("Ñzesc");	
		}else if(a.equals("France")) {
			System.out.println("Salut");
		}
				
	}


	public static void main(String[]args) {
		
		Hello h1 = new Hello();
		h1.sayHello("Russia");
		h1.sayHello("USA");
		h1.sayHello("Spain");
		h1.sayHello("Poland");
		h1.sayHello("France");
	}

}
