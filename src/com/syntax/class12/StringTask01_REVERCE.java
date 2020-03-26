package com.syntax.class12;

public class StringTask01_REVERCE {

	public static void main(String[] args) {

		String str = "Sunday";
		char i1 = str.charAt(5);
		char i2 = str.charAt(4);
		char i3 = str.charAt(3);
		char i4 = str.charAt(2);
		char i5 = str.charAt(1);
		char i6 = str.charAt(0);
		System.out.println(i1 + "" + i2 + "" + i3 + "" + i4 + "" + "" + i5 + "" + i6);

		String str1 = "Sunday";
		String reverse = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			reverse = reverse + str1.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
