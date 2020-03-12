package com.syntax.class01;

public class ifClass {

	public static void main (String [] args) {
		
	int expectedHours=15;
	int actualHours=15;
	//if actual is more than expected --> you will love java
	
	if(actualHours>=expectedHours) {
		System.out.println("You will love Java");
	}	
		else {//otherwise (if false) ==> go inside else block
			System.out.println("You will not like Java");
			
		}
System.out.println("__________________________________");

double budget=15000;
double highlanderPrice=20000;
double lexusPrice=15500;

if (highlanderPrice<=budget) {
	System.out.println("I will buy Highlander");
} else 
{System.out.println("I will not buy Highlander");
}

System.out.println("___________________________");


if (lexusPrice<=budget) 
{ System.out.println("I will buy Lexus");}
else 
{ System.out.println ("I will not buy Lexus");
}
}
	}