package com.syntax.class11;

import java.util.Scanner;

public class Task1StringEx2 {

	public static void main(String[] args) {

		System.out.println("------------another way------------");
		Scanner scan;
		String confirmedPassword;
		String password;
		String username;
		scan = new Scanner(System.in);
		System.out.println("Please enter your user name");
		username = scan.nextLine();
		System.out.println("Please enter your password");
		password = scan.nextLine();

		if (!(username.isEmpty() || password.isEmpty())) {
			if (password.length() >= 8) {
				if (!password.contains(username)) {
					System.out.println("Please confirm password");
					confirmedPassword = scan.nextLine();
					if (password.equals(confirmedPassword)) {
						System.out.println("Your account is created");

					} else {
						System.out.println("Passowrds are not matched");
					}
				} else {
					System.out.println("Passwords cannot contain username");
				}
			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Username and password cannot be empty");
		}

	}

}
