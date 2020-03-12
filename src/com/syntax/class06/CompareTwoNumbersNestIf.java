package com.syntax.class06;

import java.util.Scanner;

public class CompareTwoNumbersNestIf {

	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter num1");
		int num1 = scan.nextInt();
System.out.println("Please enter num2");
		int num2 = scan.nextInt();
		System.out.println("Please enter num3");
		
		int num3 = scan.nextInt();
		int largest;
		
		if (num1>num2) {
			//here num1 is already larger than num2
			if (num1>num3) {
				largest=num1;
			} else { largest=num3;               // num1>num2 but num1<num3
			}
			}else {//num 2>num1
			
			if (num2>num3) { largest=num2;
			}else { // num2>num1 but num2<num3
				largest=num3;
			}
		}
		System.out.println("Largest number is "+largest);
	}
}
