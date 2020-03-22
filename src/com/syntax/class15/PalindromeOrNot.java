package com.syntax.class15;

public class PalindromeOrNot {

	void palindrome(String a) {
		a = a.replaceAll("[^a-zA-Z]+", "").toLowerCase();

		int i, j;
		i = 0;
		j = a.length() - 1;

		while (i < j) {
			while (a.charAt(i) == ' ') {
				i++;
			}
			while (a.charAt(j) == ' ') {
				j--;
			}
			if (a.charAt(i) == a.charAt(j)) {
				i++;
				j--;
			} else {
				break;
			}
		}
		if (i >= j) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
	public static void main(String[] args) {
		PalindromeOrNot str1 = new PalindromeOrNot();
		str1.palindrome("never odd or even");
		
	}

}
