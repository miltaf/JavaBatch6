package com.syntax.class01;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*
		 * You are a salesman ask a user for how much his sales are based on the amount
		 * of sales, we need to calculate commission if commission is between 1 dollar
		 * to 100 dollars --> your commission should be 10% if sales is between 10 and
		 * 200 --> we are going to give you 20% commission if sales is between 200 and
		 * 500 --> commission should be 30% if you sale for more than 500 --> your
		 * commission should be 50%
		 */

		// 1. declare all variables that I will need

		Scanner scan;
		double sales;
		double commission;

		scan = new Scanner(System.in);

		System.out.println("Please enter your sales amount");
		sales = scan.nextDouble();
		if (sales >= 1 && sales <= 100) {
			// give user 10% commission
			System.out.println("Based on your sales, your commission is = " + (sales * 0.1));
			// commission = sales * 0.1;
		} else if (sales > 100 && sales <= 200) {
			// give user 20% commission
			// commission=sales*0.2;
			System.out.println("Based on your sales, your commission is = " + (sales * 0.2));
		} else if (sales > 200 && sales <= 500) {
			// give user 30% commission
			// commission=sales*0.3;
			System.out.println("Based on your sales, your commission is = " + (sales * 0.3));
		} else {

			System.out.println("Based on your sales, your commission is = " + (sales * 0.5));
		}
		if (sales > 100) {
			System.out.println("You are an awesome seller");

		}

		if (sales >= 1 && sales <= 100) {
			// give user 10% commission
			System.out.println(commission = sales * 0.1);
		} else if (sales > 100 && sales <= 200) {
			// give user 20% commission
			System.out.println(commission = sales * 0.2);
		} else if (sales > 200 && sales <= 500) {
			// give user 30% commission
			System.out.println(commission = sales * 0.3);
		} else {
			// give user 50% commission
			System.out.println (commission = sales * 0.5);
		}
		if (commission > 100) {
			System.out.println("You are an awesome seller");

		}
	}
}
