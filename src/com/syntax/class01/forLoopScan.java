package com.syntax.class01;

import java.util.Scanner;

public class forLoopScan {
	public static void main (String[] args) {
	

		  Scanner inp;
		    int x;
		    System.out.print("In:");
		    //write your code below
		   inp=new Scanner (System.in);
		   x=inp.nextInt();
		   for (int i=0; i<x; i--){
		     System.out.print(i+" ");
		   } 
		   }
}
