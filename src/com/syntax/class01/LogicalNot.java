package com.syntax.class01;

import java.util.Scanner;

public class LogicalNot {
public static void main (String[] args) {
	
	  String word1;
	  String word2;
	  int num1;
	  int num2;
	  Scanner scan = new Scanner (System.in);
	  System.out.println("Please enter two strings");
	  word1=scan.nextLine();
	  word2=scan.nextLine();
	  
	  System.out.println("Please enter two numbers");
	  num1=scan.nextInt();
	  num2=scan.nextInt();
	  
	  if (num1==num2 && word1.equals(word2)){
	    System.out.println("AND");
	  }else if (num1==num2 || word1.equals(word2)){
	    System.out.println("OR");
	  }else if (num1=!num2 && !word1.equals(word2)) {
		  System.out.println("NONE");}
	}
	}
