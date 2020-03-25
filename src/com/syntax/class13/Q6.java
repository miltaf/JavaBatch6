package com.syntax.class13;

import java.util.Scanner;

public class Q6 {
	// Write a Java Program to find whether a String is palindrome or not?
		public static void main(String[] args) {
			String str = "radar kayak radar";

			// 1st way
			char[] charArray = str.toCharArray();

			String reverse = "";
			System.out.println(reverse.isEmpty());

			for (int i = charArray.length - 1; i >= 0; i--) {
				reverse += charArray[i];
			}
			System.out.println("word is=" + str);
			System.out.println("reverse is=" + reverse);
			
			if(str.equalsIgnoreCase(reverse)) {
				System.out.println("Yes, it is a palindrome");
			}else {
				System.out.println("No, it is not a palindrome");
			}
			
			//HW use charAt() method to find if it is a palindrome
		
			System.out.println("----------palindrome-------------------");
			
			Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    
		   }
		   }
		    }
		
			
			Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String givenString = inp.nextLine();
		   	//write your code below
		   	
		   	char[] palindromes= givenString.toCharArray();
		   	String ini="";
		   	
		   	for (int i=palindromes.length-1; i>=0; i--){
		  ini += charArray[i];
		   	}
		   	  if (ini.trim().equalsIgnoreCase(givenString)) {
		   	    System.out.println (true);
		   	  }else {
		   	    System.out.println (false);
		   	  }
		   	
		   	
		   	
		}
	}
