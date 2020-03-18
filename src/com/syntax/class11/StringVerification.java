package com.syntax.class11;

public class StringVerification {

	public static void main(String[] args) {

String message="Welcome Admin";

//verify that message cvontains username or any part of the message in the String

System.out.println(message.contains("Admin"));//true
System.out.println(message.contains("Welcome"));// false because case sensitive
System.out.println(message.endsWith("Admin"));
boolean flag = message.contains("welcome");//false because case sensitive
System.out.println(flag);

// we want to see if welcome starts with Welcome

System.out.println("----------------startsWith() FUNCTION-------------");
boolean starts=message.startsWith("Welcome");

//we want to verify that welcome message ends with username
System.out.println("---------endsWith() FUNCTION--------------");
String username="Admin";

boolean ends=message.endsWith(username);
System.out.println(ends);
	
	}

}
