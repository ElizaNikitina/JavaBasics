package com.syntax.class10;

public class RetrievingValue2DArray {

	public static void main(String[] args) {

		String[][] month = { { "Desember", "January", "February" }, 
				{ "March", "April", "May" },
				{ "June", "July", "August" }, 
				{ "September", "October", "November" } };
		
		int rows = month.length;
		int firstArray=month[0].length;
		System.out.println(firstArray);
		System.out.println("=======");

		
		for(int a=0; a<month.length; a++) {
			for(int b=0; b<month[a].length; b++) {
				System.out.println(month[a][b]+" ");
			}
			System.out.println();
		}
	}

}
