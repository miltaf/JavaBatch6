package com.syntax.class07;

public class Task1 {

	public static void main(String[] args) {
		
	
		int num=50;
		while (num>=1) {
			System.out.println(num);
		num--;
	}

		//how to print odd numbers from 1 to 20
		
		System.out.println("*****************************");
		
		int num1=1;
		while (num1<20) {
		System.out.println(num1);
		num1+=2;
	}
		
		System.out.println("*****************************");
		
		int num2=1;
		while (num2<=20) {
			if (num2 % 2 != 0) {
				System.out.println(num2);
			}
			num2++;
			}
	
		int num3 = 1;
		while (num3<=20) {
			System.out.println(num3++);
			num3++;
		}
	}
}
