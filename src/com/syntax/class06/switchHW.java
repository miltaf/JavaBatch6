package com.syntax.class06;

import java.util.Scanner;

public class switchHW {

	public static void main(String[] args) {

		String responsibility=null;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the name of the instructor");
		String instructor = scan.nextLine();
		
		switch (instructor) {
		case "Shiva":
			responsibility = "will take care of Java Assignment";
			break;
		case "Sandish":
			responsibility = "will take care of SDLC Assignment";
			break;
		case "Weqas":
			responsibility = "will take care of Selenium Assignment";
			break;
		case "Asel":
			responsibility = "will take care of every Assignment";
			break;
		default:
			responsibility = "Invalid instructor is selected";
			break;
		}
System.out.println(responsibility);
	}
}