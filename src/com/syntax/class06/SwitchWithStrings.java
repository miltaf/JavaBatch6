package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		/* Ask a user where she or he is from
		 * based on the country of origin, we will define favorite food
		 * As the output, your favorite food is _____
		 */

		Scanner scan;
		String country;
		String favoriteFood;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your country");
		country=scan.nextLine();
		
		switch (country) {
			case "Morroco":
				favoriteFood="couscous";
				break;
				
			case "Belarus":
				favoriteFood="Potato";
				break;
				
			case "Tajikistan":
				favoriteFood="Osh";
			break;
			
			case "Turkey":
			favoriteFood="Baklava";
			break;
			
			case "Afghanistan":
				favoriteFood="Mantu";
			break;
			
			case "Kazakhstan":
			favoriteFood="Beshparmak";
			break;
			
			default:
				favoriteFood="Unknown";
		}
	System.out.println("Your favorite food is "+favoriteFood);
	}

}
