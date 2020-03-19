package com.syntax.class13;

public class JavaQ1 {

	public static void main(String[] args) {
		/* write a program to swap 2 numbers without a temporary variable? 2 swap
		 * Strings without a temporary variable?
		 */

		int a = 10;
		int b = 20;
		
		a=a+b;// 30
		b= a-b; //30-20 = 10
		a=a-b;
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
		
		String str1="Day";
		String str2="Night";
		str1=str1.concat(str2); // DayNight or str1=str1+str2;
		str2=str1.substring(0, 3); // Day
		str1=str1.substring(3); //Night
		
		System.out.println("The value of str1 = "+str1);
		System.out.println("The value of str2 = "+str2);
	
	System.out.println("-----------another way--------------");
	
	String s1= "Day";
	String s2="Night";
	
	s1=s1+s2; 
	s2=s1.substring(0, s1.length()-s2.length());
	s1=s1.substring(s2.length());
	
	System.out.println("The value of s1 = "+s1);
	System.out.println("The value of s2 = "+s2);

	System.out.println("-----------another way2--------------");
	
	String a1= "Day";
	String a2="Night";
	
	a1=a1+a2; 
	a2=a1.substring(0, a1.length()-a2.length());
	a1=a1.substring(a2.length());
	
	System.out.println("The value of a1 = "+a1);
	System.out.println("The value of a2 = "+a2);

	}

}
