package com.syntax.class34;

public class Task {

	private static void ageVerification(int age) {

		if (age<16) {
			throw new RuntimeException ("You are not eligible for vote");
		}else {
			System.out.println("you can vote");
		}
	}	
	public static void main(String[] args) {
		
		/* 
		 * Create a method to check age eligibility that will
		 * throw a runtime exception.
		 * Method should throw an exception age is less than 16
		 */
	
		ageVerification(18);
		ageVerification(15);
		
	}
}
