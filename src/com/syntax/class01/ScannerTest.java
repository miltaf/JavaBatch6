package com.syntax.class01;

import java.util.Scanner;

public class ScannerTest {

	public static void main (String[] args) {
		Scanner scan=new Scanner (System.in);
	System.out.println("Please enter your first name");
	String firstName=scan.nextLine();
	System.out.println("Please enter your last name");
	String lastName=scan.nextLine();
	System.out.println("Please enter your mobile number");
	long mobileNumber=scan.nextLong();
	System.out.println("Your full name is "+firstName+" "+lastName+" and your mobile Number is "+mobileNumber);
	
	
	}
}
