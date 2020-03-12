package com.syntax.class06;

import java.util.Scanner;

public class SwitchStudentName {

	public static void main (String[] args){
			   int rollNumber;
			   String studentName;
			   
			   Scanner scan = new Scanner (System.in);
			   System.out.println("enter the roll number of the Child");
			   rollNumber=scan.nextInt();
			   
			   switch (rollNumber){
			     case 101:
			       studentName="Student name: Ramesh";
			     break;
			     case 102:
			       studentName="Student name: Mahesh";
			     break;
			     case 103:
			       studentName="Student name: Mukesh";
			      break;
			  default:
			      studentName="Not found Student name: in Class";
			      break;
			   }
System.out.println(studentName);
	}

}
