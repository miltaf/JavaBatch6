package com.syntax.class11;

import java.util.Scanner;

public class Task1StringPractice {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password from a user and check
		 * following requirements: 1. Username and Password cannot be empty, if so -->
		 * message= "username and Passowrd cannot be empty". 2. Password should be
		 * minimum 8 characters, if less --> message= "Password is too short." 3.
		 * Password cannot contain username if so, message=
		 * "Password cannot contain username". 4. Password should match confirmed
		 * password, if not --> message= "Passwords do not match". Only after all
		 * requirements met --> message your username and password has been created".
		 */

		Scanner scan = new Scanner(System.in);
		String confirmed = "Password@123";

		System.out.println("Please enter your username");
		String userName = scan.nextLine();
		System.out.println("Please enter your passowrd");
		String passWord = scan.nextLine();

		if (userName.isEmpty() || passWord.isEmpty()) {
			System.out.println("Username and Passowrd cannot be empty");
		} else if (passWord.length() < 8) {
			System.out.println("Password is too short");
		} else if (passWord.contains(userName)) {
			System.out.println("Password cannot contain username");
		} else if (!passWord.equals(confirmed)) {
			System.out.println("Passowrds do not match");
		} else {
			System.out.println("Your username and passowrd has been created");
		}

}
}
