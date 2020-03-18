package com.syntax.class12;

public class StringManipulation {

	public static void main(String[] args) {
	//to get substring from a given String
		// substring=string inside your string
		System.out.println("---------------substring() FUNCTION-------");
		
		String str="Today is a rainy day";
		
		String partialString=str.substring(6);//start from 6 untilt the end of String
		System.out.println(partialString);
		
		//rainy day
		partialString = str.substring(11);
		System.out.println(partialString);
		
		//Today
		partialString=str.substring(0, 5);// start from 0 end at index 5
		System.out.println(partialString);
	
		//rainy
		partialString=str.substring(11, 16);
		System.out.println(partialString);
		
String day="Sunday";

String given="I love Java classes at Syntax";
String half=given.substring(11);
System.out.println(half);

String half1=given.substring(0, 10);
System.out.println(half1);


	}

}
