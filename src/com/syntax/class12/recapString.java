package com.syntax.class12;

public class recapString {

	public static void main(String[] args) {
		
		String str=""; // empty value
		System.out.println(str.isEmpty());
		
		String str1=null; // null means no value at all
		//System.out.println(str1.isEmpty()); // Runtime error --> NullPointerException
		
		String str2=" Good morning ";
		String str3="students";
		String str4="!";
		
		str2=str2.concat(str3).trim().concat(str4);
		System.out.println(str2);
	
		String str0="Good Morning Students!";
		