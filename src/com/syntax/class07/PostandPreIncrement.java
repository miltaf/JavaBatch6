package com.syntax.class07;

public class PostandPreIncrement {

	public static void main (String [] args) {
		int num;
		int y=10;
		num=y++;
		System.out.println(num);

		System.out.println("******************************");

		int num1;
		int x=10;
		num1=++x;
		System.out.println(num1);

		System.out.println("******************************");

		int num2=1;
		while (num2<5) {
			System.out.println(num2++);
		}
		
	}
}
