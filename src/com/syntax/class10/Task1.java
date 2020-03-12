package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it.
		// using 2 different loops, print all animals from the array

		
		String[] animals= {"Monkey", "Dog", "Cat", "horse"};
			for (String animal: animals) {
				System.out.println(animal); 
			}
		System.out.println("-----------------");
		
		// regular for loop
		for (int num=0; num<animals.length; num++) {
			System.out.println(animals[num]);
		}
	
		int [] nums= {2, 3, 8, 10};
	
		int sum=0;
		for (int i:nums) {
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("--------------------------");

		for (int i=0; i<nums.length; i++) {
			sum1+=nums[i];
		}
		System.out.println(sum);
		}
		
	}

}
