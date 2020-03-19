package com.syntax.class10;

public class Task04 {

	public static void main(String[] args) {
		int[] nums = {1000, 30, -1, 900, 56, 787 };

		int max = nums[0];
		for (int b=1; b<nums.length; b++) {
			if (nums[b] > max) {
				max=nums[b];
				
			}
				
		}
		System.out.println(max);
	}

}
