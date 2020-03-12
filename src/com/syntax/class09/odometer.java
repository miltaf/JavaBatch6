package com.syntax.class09;

public class odometer {

	public static void main(String[] args) {

		// print odometer up to 9999

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int z = 0; z < 10; z++) {
						System.out.println(i + "" + j + "" + k + "" + z);
					}
				}

			}

		}

		System.out.println("----------------------");

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.println("*");
			}
		}
		System.out.println("----------------------");

		for (int a = 1; a <= 5; a++) {
			System.out.print("*");
		}

		System.out.println("----------------------");

		for (int a = 1; a <= 5; a++) {

			System.out.println("*");
		}

		System.out.println("----------------------");
		//printing patterns using nexted loops
		for (int i=1; i<=4; i++) {
			for (int m=1; m<=5; m++) {
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println("----------------------");
		
		for (int star=1; star<=10; star++) {
			for (int moon=1; moon<=10; moon++) {
				System.out.print("$");
			}
		System.out.println();
		}
	
		System.out.println("----------------------");
		
		for (int i=1; i<=5; i++) {
			for (int m=1; m<=10; m++) {
				System.out.print(" & ");
			}
		System.out.println();
		}

		System.out.println("----------------------");
		
		for (int num=1; num<=4; num++) {
			for (int num1=1; num1<=5; num1++) {
				System.out.print(num+" ");
			}
		System.out.println();
		}

	System.out.println("-----------------------------");

	for (int i=1; i<=5; i++) {
		for (int y=1; y<=9; y++) {
			System.out.print(y+" ");
		}
	System.out.println();
	}
	
	System.out.println("--------------------------");
for (int i=5; i>=1; i--) {
	for (int y=5; y>=1; y--) {
		System.out.print(y+" ");
	}
System.out.println();
}
	
System.out.println("------------------------");

	
	}
}