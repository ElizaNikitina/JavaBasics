package com.syntax.class18;

public class Task01 {
	
	Task01(){
		System.out.println("I am constructor without any paramets");
	}
	
	Task01(String a){
		System.out.println("I am constructor with one String paramet " + a);
	}
	
	public static void main(String[] args) {
		Task01 obg1 = new Task01();
		
		new Task01("Hello");
		
		Task01 obg2 = new Task01("Hello again");
	}

}
