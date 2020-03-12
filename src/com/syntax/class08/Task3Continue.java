package com.syntax.class08;

import java.util.Scanner;

public class Task3Continue {

	public static void main(String[] args) {
		/* Write a program that reads a range of integers (star and end points),
		 * provided by a user and then from that range prints the sum of the even and odds integers
		 */
		
		Scanner scan=new Scanner(System.in);
		int totalEven=0;
		int totalOdd=0;
		
		System.out.println("Write start and end points");
		
		int min=scan.nextInt(); //10
		int max=scan.nextInt();//20
		
		for (int i=min;i<=max; i++) {
			if (i % 2 == 0) {
				totalEven=totalEven +i;
			}else {
				totalOdd = totalOdd+i;
				}
			}
			System.out.println("the total of even numbers between "+min+" to " +max+ " is "+totalEven);
			System.out.println("the total of even numbers between "+min+" to " +max+ " is "+ totalOdd);
			
		}

	}
