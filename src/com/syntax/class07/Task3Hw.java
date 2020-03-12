package com.syntax.class07;

public class Task3Hw {

	public static void main(String[] args) {
		/* print numbers from 1 to 100 in 1 line with space
		 * print numbers from 100 to 1
		 * print even numbers from 20 to 1(2 ways)
		 * print odd numbers between 20 and 50 (2 ways)
		 */

		for (int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}

		System.out.println("******************************");
		
		for (int i=101; i>=1; i--) {
			System.out.println(i);
		}

		System.out.println("******************************");
		
int num1=1;
while (num1<=20) {
	if (num1 % 2 !=1) {
		System.out.println(num1);
	}
	num1++;
}

System.out.println("******************************");

int num2=20;
while (num2<=50) {
	if (num2 % 2 !=0) {
		System.out.println(num2);
	}
	num2++;
	}

System.out.println("******************************");

int evensSum=0;
int oddsSum=0;

for (int i=1; i<=99; i++) {

	if (i%2==0) {
	evensSum=evensSum+i;
	} else {
		oddsSum=oddsSum+i;
	}
	}
	System.out.println(evensSum);
	System.out.println(oddsSum);


	}

}

