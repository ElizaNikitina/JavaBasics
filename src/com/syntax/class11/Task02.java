package com.syntax.class11;

public class Task02 {

	public static void main(String[] args) {
//		Create an array of countries: north america countries, 
//		south america countries, europe countries, asian countries, african countries. 
//		Then print all values from that array using 2 different loops 
//		and calculate how many total countries been stored.
		
		String[][] countries= {{"USA", "Canada"},
		{"Brazil", "Columbia", "Peru", "Ecuador", "Argentina"},
		{"Germani", "Italy", "France", "Finnland","Spain", "Poland"},
		{"India", "Thailand", "Vietnam", "Indoasia"},
		{"Algir", "Morocco", "Chad", "Gana", "Egipt"}
		};
		
		for(int a=0; a<countries.length; a++) {
			for(int b=0; b<countries[a].length; b++) {
				System.out.print(countries[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Second loop");
		for(String[] name:countries) {
			for(String countrie:name) {
				System.out.println(countrie+" ");
			}
			System.out.println();
		}
		
		 int count = 0;
	        for (int i = 0; i < countries.length; i++) {
	            for (int j = 0; j < countries[i].length; j++) {
	                count++;     
	            }	                  
			}
	        System.out.println(count);
	        
	        System.out.println("===advanced for loop");
	        
	        int count1=0;
	        for(String[] b:countries) {
	        	for(String c:b) {
	        		count1++;
	        	}
	        }
	        System.out.println(count1++);
	}

}
