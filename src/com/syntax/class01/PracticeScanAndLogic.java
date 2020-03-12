package com.syntax.class01;

import java.util.Scanner;

public class PracticeScanAndLogic {
public static void main (String[] args) {
	
	Scanner scan;
	scan=new Scanner (System.in);
	System.out.println("Enter your height in inches");
	int height;
	height=scan.nextInt();
	
	if (height>0 && height<=60) {
		System.out.println("You are short");
	} else if (height>=61 && height<=72) {
		System.out.println("You are medium");
	}else if (height > 72) {
	System.out.println ("You are tall");
	} else {
		System.out.println("Invalid height");
	}
	
	int days=5;
	scan=new Scanner(System.in);
	System.out.println("Enter any day from 1 to 5");
	days=scan.nextInt();
	
	if (days<=1 && days>=5) {
		System.out.println("It is a weekday");
	} else if (days<=6 && days>=7) {
		System.out.println("It is a weekend");
	} else {
		System.out.println("Invalid day");

}
}}