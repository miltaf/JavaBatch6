package com.syntax.class01;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		/*
		 * Take age input from a user and then based ont he age print out if age is from
		 * 0-3 --> you are a baby if age is from 4-5 --> you are a kid if age is from
		 * 6-12 --> ou are a child if age is from 13-19 --> you are a teenager if age is
		 * from 20-64 --> you are an adult if age is more or equal to 65 --> you are a
		 * senior
		 */

		// 1. let's declare all variables

		int age;
		// Scan scan+Ctrl+Shift+O --> to import, we use (for windows user):
		// ctrl+shift+O; for mac users: cmd+shift+O

		Scanner scan;

		// 2. capture values

		scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();

		// 3. perform verification

		if (age > 0) {
		if (age < 3) {
			System.out.println("You are a baby");
		} else if (age >= 3 && age <= 5) {
			System.out.println("You are a kid");
		} else if (age >= 6 && age <= 12) {
			System.out.println("You are a child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("You are a teenager");
		} else if (age >= 20 && age < 65) {
			System.out.println("You are enjoying your life");
		}
		} else { 
			System.out.println ("Please enter a valid age");
			
		}
	}
}
