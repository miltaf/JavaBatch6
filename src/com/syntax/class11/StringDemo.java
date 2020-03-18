package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		
		String school="Syntax";
		String str=new String("Hello");
		String str1=("This is a String 7676,&^&^");

	// To find out the number of characters inside string "Class"
		System.out.println("---------LEGTH() FUNCTION------------");
	System.out.println(school.length());
	
	int size=str.length();
	System.out.println("String length is "+size);
	
	//convert String to lower case or upper case
	System.out.println("--------TO UPPER CASE/ TO LOWERCASE FUNCTION--------");
	System.out.println(school.toUpperCase());
	System.out.println(str.toLowerCase());
	str=str.toLowerCase();
	System.out.println(str);
	
	System.out.println("----CONCAT FUNCTION-----");
	
	//concatinate 2 Strings
	String newString=str+school;
	System.out.println(newString);
	
	String day = "Saturday";
	String date="14";
	
	String newDate=day.concat(date);
	System.out.println(newDate);

	System.out.println("-----------is Empty FUNCTION----------");
	
	String str3="";
	boolean empty=str3.isEmpty();
	System.out.println(empty);

	System.out.println("-----------trim() FUNCTION----------");

	String str4="      Welcome to Syntax!     ";
	str4=str4.trim();
	System.out.println(str4);
	}

}
