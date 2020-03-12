package com.syntax.class06;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {

		int grade;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your mark");
		grade = scan.nextInt();

		if (grade > 80 && grade<=100) {
			System.out.println("Your grade is A");
		} else if (grade <= 80 && grade > 60) {
			System.out.println("Your grade is B");
		} else if (grade <= 60 && grade > 50) {
			System.out.println("Your grade is C");
		} else if (grade <= 50 && grade > 45) {
			System.out.println("Your grade is D");
		} else if (grade <= 45 && grade > 25) {
			System.out.println("Your grade is E");
		} else if (grade <= 25 && grade >= 1) {
			System.out.println("Your grade is F");
		} else {
			System.out.println("Please enter valid mark");
		}
	}

}
