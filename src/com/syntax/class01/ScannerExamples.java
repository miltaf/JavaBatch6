package com.syntax.class01;

import java.util.Scanner;

public class ScannerExamples {

	public static void main (String[] args) {
		  Scanner scan=new Scanner (System.in);
		  System.out.println ("Enter your name");
		  String name=scan.nextLine();
		  System.out.println("Enter your mobile number");
		  String mobileNumber=scan.nextLine();
		  System.out.println("Enter your age");
		  int age=scan.nextInt();
		  
		  System.out.println("Your name is "+name+", your age is "+age+" and your mobile number is "+mobileNumber);
		  

	}
	
	
}