package com.syntax.class01;

import java.util.Scanner;

public class nestingIftask {

	public static void main(String[] args) {
	
	int temp = 85;
			
Scanner scan=new Scanner (System.in);
System.out.println("Is it sunny outside?");
String response=scan.nextLine();
		if (response.equalsIgnoreCase("Yes")) {
			System.out.println("It is sunny day, I should go somewhere!");
			System.out.println("What is the temperature outside?");
			temp=scan.nextInt();
			if (temp >= 85) {
				System.out.println("I am going to the beach!");
			} else {
				System.out.println("I am going to the park!");
			}
			
		} else {
			System.out.println("I stay home and study Java!");
		}

	}
}
