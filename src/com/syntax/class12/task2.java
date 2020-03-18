package com.syntax.class12;

import java.util.Scanner;

public class task2 {
public static void main (String[] args) {

	/* Write a program that reads two people's first names
	 * and if they are expecting boy or girl?
	 * Based on the input suggests a name for a baby:
	 * Example Output: 
	 * Mom's first name? Mary
	 * Dad'sfirst name? Daniel
	 * Boy or Girl? boy
	 * Suggested baby name: DANRY
	 * 
	 * Example Output:
	 * Mom's first name? Mary
	 * Dad's first anme? Daniel
	 * Boy or Girl? girl
	 * Suggested baby name: MAIEL
	 */

Scanner scan = new Scanner (System.in);
System.out.println("Please tell me your first names?");
String name1=scan.nextLine();
String name2=scan.nextLine();
String baby="boy";
System.out.println("Are you expecting boy or girl?");
String babyName=scan.nextLine();

String suggestedBName=null;

int half1=name1.length() /2;
int half2=name2.length() / 2;

if (babyName.equalsIgnoreCase("Girl")) {
	suggestedBName=name1.substring(0, half1) + name2.substring(half2); 
	System.out.println(suggestedBName);
	if (babyName.equalsIgnoreCase("Boy")) {
		suggestedBName=name2.substring(0, half2)+ name1.substring(half1);
		System.out.println(suggestedBName);
	}
}
}
}
