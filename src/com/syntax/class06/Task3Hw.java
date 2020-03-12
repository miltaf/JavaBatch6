package com.syntax.class06;

import java.util.Scanner;

public class Task3Hw {

	public static void main(String[] args) {
		/* Allow user to enter grade and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */

		Scanner scan;
		char grade;
		String reason;
		
		scan = new Scanner (System.in);
		
		System.out.println("Enter your grade");
		grade = scan.next().charAt(0)
				switch (grade) {
					case 'A':
						reason="A-Excellent";
						break;
						
					case 'B':
						reason="B-Good";
						break;
						
					case 'C':
						reason="C-Average";
						break;
						
					case 'D':
						reason="D-Bad";
						break;
					default:
						reason="Not Acceptable";
				}
		System.out.println("You scored "+grade +"you are "+reason);
	}

}
