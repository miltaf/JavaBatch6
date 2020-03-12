package com.syntax.class01;

import java.util.Scanner;

public class nestedIf {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("Are you are boy or a girl?");
		String boyGirl=input.next();
		System.out.println("Are you rich? true/ false");
		boolean rich = input.nextBoolean();
		
		System.out.println("You are a "+boyGirl+" and you are rich "+rich);
		
		if (boyGirl.equals("boy")) {
		System.out.println("Yaaaay");
		if (rich) {
			System.out.println("Buy a ferrari");
		}else {
			System.out.println("Go play sports");
		}
		}else if (boyGirl.equals("girl")) {
			System.out.println("Yaya");
			if (rich) {
				System.out.println("Buy a doll");
			}else {
				System.out.println("watch a cartoon");
			}
		}
	else{
				System.out.println("sleep well at home");
				}

		}
}
