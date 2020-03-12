package com.syntax.class01;

public class nestingifmortgagetask2 {
	public static void main(String[] args) {
		float mortgageRate = 4.4f;
		long mortgagePrice = 210000;

		if (mortgageRate > 4.5) {
			System.out.println("user will not buy a house");
		} else {
			System.out.println("user will consider buying a house");
			if (mortgagePrice > 200000) {
				System.out.println("user will take a loan");
			} else {
				System.out.println("user will pay cash");
			}
		}
	}
}
