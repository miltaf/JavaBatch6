package com.syntax.class12;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
	System.out.println("Enter a String");
	String str=scan.nextLine();
	if (!str.isEmpty()) {
		if (str.length() % 2==1 && str.length()>=3) {
			System.out.println(str.substring(1, str.length()-1));
		}else {
			System.out.println("Even number of characters");
		}
	}
	
	String str = "Sunday";
	char reverse;
	for (int i=str.length()-1; i>-1;i--) {
		reverse=str.charAt(i);
		System.out.println(reverse);
	}
	System.out.println();
	
	//task2
	Scanner input = new Scanner (System.in);
	System.out.println("enter a String please : ");
	String text = input.nextLine();
	if (!text.isEmpty()) {
		if (text.length()% 2=-1 && text.length()>)
	}
	String letter="";
	for(int i=day.length()-1; i>=0; i--) {
		
		for (int i = day.length()-1; i >= 0; i--) {
			letter = letter + day.charAt(i);
		}
		System.out.print("letter string is:");
		System.out.println(letter);
		
		letter=day.charAt(i);
		System.out.print(day+" ");
	}
	System.out.println();
	}
	
	
}
