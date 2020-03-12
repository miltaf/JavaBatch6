package com.syntax.class06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		String gender = scan.next();
		System.out.println("Please enter your age");
		int age = scan.nextInt();
		if (age >= 25 &&  gender.equals("M")) {
		System.out.println("Man");
		} else if (age >= 25 &&  gender.equals("F")) {
			System.out.println("Woman");
		} else if (age < 25 &&  gender.equals("M")) {
			System.out.println("Boy");
		} else if (age < 25 &&  gender.equals("F")) {
			System.out.println("Girl");
		}
	
	
	}

}
