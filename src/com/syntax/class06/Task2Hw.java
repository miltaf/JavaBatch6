package com.syntax.class06;

import java.util.Scanner;

public class Task2Hw {

	public static void main (String[] args) {
		
		//Ask user to enter their country and capture it. Once values are captured, print which language user speaks.
	
		
		Scanner scan;
		String country;
		String language;
		
		scan = new Scanner(System.in);
		
		System.out.println("Enter your country");
		country=scan.nextLine();
		
		switch (country) {
		case "Afghanistan":
			language = "Dari";
		break;
		
		case "Morroco":
			language = "Arabic";
			break;
			
		case "Pakistan":
			language="Urdu";
			break;
		
		case "India":
			language = "Hindi";
			break;
		default:
			language = "Unknown";
		}
System.out.println("You are from "+country+" and you speak "+language);
	}
}
