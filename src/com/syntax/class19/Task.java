package com.syntax.class19;

import java.util.Scanner;

public class Task {

	static int hour, min;
	
	public void time() {
	
		  Scanner sc = new Scanner (System.in);
		  System.out.println ("time");
		  
	hour=sc.nextInt();
	min=sc.nextInt();

			System.out.println(hour+":"+min);
		}


		public static void main (String[] args){
		  Task call = new Task ();
		  call.time();
		}
}
