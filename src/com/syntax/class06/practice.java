package com.syntax.class06;

import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	
	boolean isSunny;
	int temp;
	Scanner scan = new Scanner (System.in);
	
	  System.out.println("Is it sunny outside?");
	  isSunny = scan.nextBoolean();
	
	 	  if (isSunny==true) {
	 		 System.out.println("It is a sunny day, I should go somewhere!");
	 		System.out.println("What is the weather temperature?");
	 		  temp=scan.nextInt();	  	
	 		  if (temp>=85) {
	 			 System.out.println("I am going to beach");
	 			 }else if (temp<85){
	 				 System.out.println("I am going to the park");
	 			 }
	 	  }else {
	  System.out.println("I stay home and practice Java");
	  } 
	  
	}
	}