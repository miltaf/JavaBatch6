package com.syntax.class10;

import java.util.Scanner;

public class nestedForLoopArray {

	public static void main(String[] args) {


		int[] numbers=new int[11];
		numbers[0]=2010;
		numbers[1]=2011;
		numbers[2]=2012;
		numbers[3]=2013;
		numbers[4]=2014;
		numbers[5]=2015;
		numbers[6]=2016;
		numbers[7]=2017;
		numbers[8]=2018;
		numbers[9]=2019;
		numbers[10]=2020;
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
	
	    String [] day= new String[7];  
	    Scanner scan = new Scanner (System.in);
	    
	    for (int w=0; w<day.length; w++) {
	    	System.out.println("Please enter day 1 of the week");
	    	day[w] = scan.nextLine();
	    	System.out.println("Please enter day 2 of the week");
	    	day[w] = scan.nextLine();
	    	System.out.println("Please enter day 3 of the week");
	    	day[w] = scan.nextLine();
	    	System.out.println("Please enter day 4 of the week");
	    	day[w] = scan.nextLine();
	    	System.out.println("Please enter day 5 of the week");
	    	day[w] = scan.nextLine();
	    	System.out.println("Please enter day 6 of the week");
	    	day[w] = scan.nextLine();
	    	System.out.println("Please enter day 7 of the week");
	    	day[w] = scan.nextLine();  	
	    }
	    for (String d : day) {
	    	System.out.println(d);
	    }
	}
}
