package com.syntax.class08;

public class BreakAndContinuation {

	public static void main(String[] args) {
		// once i=4 --> we want to stop the loop
		for (int i=1; i<=10; i++) {
			if (i==4) {
				System.out.println("I am stopping loop");
				continue;
				
			}
		System.out.println("I am inside the loop");
		System.out.println(i);
		}
		
		System.out.println("I am outside the loop");

		System.out.println("*********************************");

		// write a program that print numbers from 1 to 20
		// I do not want to print 5, 6, 7
		
		for (int y=1; y<21; y++) {
			if (y==5 || y==6 || y==7) {
				continue;
			}
			System.out.println(y);
		}
		
		// write a program that print numbers from 1 to 100 
		// I do not want to print 35 - 55
		
		for (int i=1; i<=100; i++) {
			if (i >=35 && i<=55) {
				continue;
			}
				System.out.println(i);
			}
	}

}
