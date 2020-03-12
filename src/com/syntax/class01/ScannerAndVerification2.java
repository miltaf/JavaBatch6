package com.syntax.class01;

import java.util.Scanner;

public class ScannerAndVerification2 {

	public static void main(String[] args) {

		  Scanner input=new Scanner (System.in);
		  System.out.println("Please enter first number");
		  int x=input.nextInt();
		  System.out.println("Please enter second number");
		  int y=input.nextInt();
		  boolean result1= (x*y)>0;
		  boolean result2=(x*y)<0;
		  if (result1) {
		    System.out.println("true");
		  } else if (result2){
		    System.out.println("false");
		}
	}

}
