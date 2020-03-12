package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {

		String [] countries = {"USA", "Poland", "Ukraine", "Turkey", "Spain"};
		for (String country: countries) {
			
			if (country.equals ("USA")) {
				System.out.println("the capital of "+country+" is Washington");
			} else if (country.equals ("Poland")) {
				System.out.println("the capital of "+country + " Warsaw");
			}else if (country.equals ("Ukrain")) {
				System.out.println("the capital of "+country+ "Kiev");
			}else if (country.equals("Turkey")) {
				System.out.println("The capital of "+country+" is Ankara");
			}else if (country.equals("Spain")) {
				System.out.println("the capital of "+ country + " is Madrid");
			}
			}
			
			System.out.println("-------------2nd method------------");
			
			for (int y=0; y<countries.length; y++) {
				switch (countries[y]) {
				case "USA":
					System.out.println("the capital of is Washington");
				break;
				case "Poland":
				System.out.println("the capital is Warsaw");
				break;
				
				case "Ukrain":
					System.out.println("the capital is Kiev");
				break;
				case "Turkey":
					System.out.println("The capital is Ankara");
					break;
				case "Spain":
					System.out.println("The capital is Madrid");
					break;
				}

			}
	}
}
