package com.syntax.class11;

public class Task01 {

	public static void main(String[] args) {
//		Create an array of cars : american, german, korean, italian. 
//		Then retrieve all values from that array using 2 different loops
		
		String[][] cars= {{"lincoln", "ford", "cadilac"},
				{"BMW", "Mersedes", "Audi"},
				{"Hyundai", "Kia", "Daewoo"},
				{"Fiat", "Ferrari", "Lamborghini"}
				
		};
		for(int a=0; a<cars.length; a++) {
			for(int b=0; b<cars[a].length; b++) {
				System.out.print(cars[a][b]+" ");
			}
		System.out.println(" ");
		}
		System.out.println("=====advanced loop====");
		

		for(String[] name:cars) {
			for(String car:name) {
				System.out.println(car+" ");
			}
			System.out.println();
		}

	}

}
