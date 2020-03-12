package com.syntax.class01;

import java.util.Scanner;

public class ScannerAndVerification {

	public static void main (String[] args) {
	
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter first number");
		int num1=input.nextInt();
		
		System.out.println("Please enter a second number");
		int num2=input.nextInt();
		//Ssytem.out.println(num1);
		//System.out.println(num2);
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
			else if (num2==num1) {
				System.out.println(num1+" is equal to "+num2);
			}else {
				System.out.println(num2+" is alrger than "+num1)
			}
		}
		
}
}
