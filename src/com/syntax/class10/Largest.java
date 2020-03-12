package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		// find largest element from an array
		
		int[] nums= {200, 30, -1, 900, 56, 786,5000,4000};
		int largest=nums[0]; // variable 0 containing assume 200 is the largest here
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i]>largest) {
				largest=nums[i];
		System.out.println(i);
		}
		}
		System.out.println("Largest num is "+ largest);
	}

}
