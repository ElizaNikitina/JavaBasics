package com.syntax.class10;

public class TwoDementionalArray {

	public static void main(String[] args) {
		int[][] nums = new int[3][4];
		// 1st row
		nums[0][0] = 10;
		nums[0][1] = 20;
		nums[0][2] = 30;
		nums[0][3] = 40;
		// 2nd row
		nums[1][0] = 5;
		nums[1][1] = 10;
		nums[1][2] = 15;
		nums[1][3] = 20;
		// 3rd row
		nums[2][0] = 1;
		nums[2][1] = 2;
		nums[2][2] = 3;
		nums[2][3] = 4;

		System.out.println(nums[1][2]);

		int[][] nums1 = { { 10, 20, 30, 40 }, { 5, 10, 15, 20 }, { 1, 2, 3, 4 } };
		
		System.out.println(nums1[2][3]);
		System.out.println(nums1[0][2]);
		
		String[][] month= {{"Desember","January", "February"},
				          {"March", "April", "May"},
				          {"June", "July", "August"},
				          {"September", "October", "November"}
		};
		
		System.out.println(month[0][2]);
		System.out.println(month[1][2]);
		System.out.println(month[2][2]);
		System.out.println(month[3][2]);

	}

}
