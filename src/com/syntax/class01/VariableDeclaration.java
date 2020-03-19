package com.synrax.class01;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		// create a variable and store value
		//1 way: declaring a viable and assigning a value
		
		boolean b = true;
		
		//2 way: 1 step --> declare variable
		//       2 step --> assign value
		
		int i;
		i = 1000;
		System.out.println(i);

		//declare multiple variables and assign value later
		
		char x, y, z;
		x = 'A';
		y = '^';
		z = '0';
		
		z = '#'; //reassining the value
		i = 2000; //reassining the value
		System.out.println(i);
		System.out.println(z);
		

	}

}
