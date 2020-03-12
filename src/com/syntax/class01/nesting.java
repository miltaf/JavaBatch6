package com.syntax.class01;

import java.util.Scanner;

public class nesting {
public static void main (String[] args) {
	
	int num = 0;
    String evenOdd = ((num % 2 == 0) ? "even" : "odd");
    
	Scanner reader = new Scanner(System.in);

      System.out.print("Enter any number");
      num = reader.nextInt();

      if(num % 2 == 0)
      { System.out.println(num + " is " + evenOdd);
      
      if (num>=1000) {
	System.out.println(num+ " is large");} 
      } else {
	     System.out.println (num+ " is just right");}
}
}