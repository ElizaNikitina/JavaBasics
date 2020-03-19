package com.syntax.class10;

public class Task03 {

	public static void main(String[] args) {
		String[] countries = { "Russia", "USA", "Germany", "Poland", "Ukraine", "France", "Italy" };

		String[] capitals = { "Moscow", "Washington", "Berline", "Warshau", "Kiev", "Pearis", "Rome" };

		for (int a = 0; a < countries.length; a++) {
			System.out.print(countries[a] + " ");
		}

		System.out.println();
		System.out.println("====");

		for (String country : countries) {
			if (country.equals("Russia")) {
				System.out.println(capitals[0] + " is capital of " + country);
			} else if (country.equals("USA")) {
				System.out.println(capitals[1] + " is capital of " + country);
			} else if (country.equals("Germany")) {
				System.out.println(capitals[2] + " is capital of " + country);
			} else if (country.equals("Poland")) {
				System.out.println(capitals[3] + " is capital of " + country);
			} else if (country.equals("Ukraine")) {
				System.out.println(capitals[4] + " is capital of " + country);
			} else if (country.equals("France")) {
				System.out.println(capitals[5] + " is capital of " + country);
			} else if (country.equals("Italy")) {
				System.out.println(capitals[6] + " is capital of " + country);
			}

			System.out.println("=====2nd way======");

			for (int a = 0; a < countries.length; a++) {
				switch (countries[a]) {
				case "Russia":
					System.out.println(capitals[0] + " is capital of " + countries[a]);
					break;
				case "USA":
					System.out.println(capitals[1] + " is capital of " + countries[a]);
					break;
				case "Germany":
					System.out.println(capitals[2] + " is capital of " + countries[a]);
					break;
				}

			}
		}
	}

}
