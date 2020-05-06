package com.syntax.class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

	
		int i;
			try {
				System.out.print("enter an int => ");
				i = s.nextInt();
			}catch (InputMismatchException e) {
						System.out.println("Error! " + e);
					}
			s.close();
				}
			
	}
