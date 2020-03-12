package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
	
	// we want to ask user's name 5 time sand print 'Good Afternoon'+name times;
		
	Scanner input;
	int num=1;
	String name;
	String name1;
	String name2;
	String name3;
	String name4;

	input = new Scanner (System.in);
	
	System.out.println("What are your names?");
	name=input.nextLine();
	name1=input.nextLine();
	name2=input.nextLine();
	name3=input.nextLine();
	name4=input.nextLine();

		while (num<=5) {
		num++;
		}	
		System.out.println("Good afternoon "+name+", "+name1+", "+name2+", "+name3+", and "+name4);
	}

}
