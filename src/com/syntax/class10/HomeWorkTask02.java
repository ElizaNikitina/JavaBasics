package com.syntax.class10;

public class HomeWorkTask02 {

	public static void main(String[] args) {
		
		String[][] students = {
				{"Eliza", "Artem","Andrei","Elena"},
				{"A", "B", "C", "D", "E"}
				
		};
		System.out.println(students[0][0] + " has grade " + students[1][0]);
		System.out.println(students[0][1] + " has grade " + students[1][1]);
		
		System.out.println("======");
		String[][] students1 = new String[4][2];
		students1[0][0] = "Eliza";
		students1[0][1] = "B";
		
		
		students1[1][0] = "Artem";
		students1[1][1] = "B";
		
		students1[2][0] = "Andrei";
		students1[2][1] = "D";
		
		students1[3][0] = "Egor";
		students1[3][1] = "A";
		
		
		for(int a=0; a<students1.length; a++) {
			for(int b=0; b<students1[a].length; b++) {
				System.out.println(students1[a][b]+" hase grade "  );
			}
			System.out.println();
					
			
		}
		


	}
}
