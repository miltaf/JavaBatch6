package com.syntax.class15;

public class Language {
	void lang(String country) {
		switch(country.toLowerCase()) {
		case "russia":
			System.out.println("Privet");
			break;
		case "tajikistan":
			System.out.println("Salom");
			break;
		case "mexico":
			System.out.println("hola");
			break;
			default:
				System.out.println("wrong language");
		
		}
	}
	
	public static void main (String [] args) {
		
		Language obj = new Language();
		
		obj.lang("Russia");
		
	}
}
