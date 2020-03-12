package com.syntax.class01;

public class twoCondition {
	public static void main(String[] args) {

		boolean isFriday = false;
		int date = 14;

		if (isFriday) {
			System.out.println("Today is Friday, I am  going to watch a movie");
			if (date == 13) {
				System.out.println("I'll watch scary movie");
			} else {
				System.out.println("I will watch a comedy movie");
			}
		} else {
			System.out.println("Today is not Friday, I am staying home");
		}

		boolean allergy = true;
		boolean appleAllergy = true;
		boolean orangeAllergy = true;
		boolean kiwiAllergy = false;

		if (allergy) {
			System.out.println("Please answer below");
			if (orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
			if (appleAllergy) {
				System.out.println("Do not eat apples");
			}
			if (kiwiAllergy) {
				System.out.println("Do not eat kiwi");
			}
		} else {
			System.out.println("You are healthy");
		}
	}
}