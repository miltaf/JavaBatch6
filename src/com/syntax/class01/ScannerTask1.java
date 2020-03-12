package com.syntax.class01;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
		Scanner  = new Scanner(System.in);
		System.out.println("Please enter the amount of loan needed");
		int num1 = input.nextInt();

		if (num1 <= 200000) {
			System.out.println("Your loan is accepted");
		} else {
			System.out.println("Your loan is rejected");
		}
	}
}
