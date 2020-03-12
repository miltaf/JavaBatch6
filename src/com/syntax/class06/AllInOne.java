package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		/* Write a program to ask user if there is a sale
		 * If no sale --> not going to shopping
		 * If sale, we will ask the price of the item
		 * Based on the price, we will apply discount and calculate final price
		 * 
		 * If price is less than 20 --> apply 10% discount
		 * if price is between 20 and 100USD --> apply 20% discount
		 * if price is between 100 and 500 USD --> apply 30% discount
		 * if price is more than 500 --> apply 50% discount
		 *
		 *After discount ___, the price of the item reduced from ___ to ___
		 */

		Scanner scan;
		String sale;
		double price; 
		double discount;
		double finalPrice;
			scan=new Scanner(System.in);
		
		System.out.println("Is there a sale?");
		sale=scan.nextLine();
		
		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price?");
			price=scan.nextDouble();
			
			if (price<=20) {
				discount=price*0.1;
			}else if (price>20 && price<=100) {
				discount=price*0.2;
			}else if (price>100 && price<=500) {
				discount=price*0.3;
			}else {
				discount=price*0.5;
			}
			finalPrice= price - discount;
			System.out.println ("After "+discount+", discount the price of the item reduced from "+price+" to "+finalPrice);

		}else {
			System.out.println("No shopping today");
		}
	
	}
}
