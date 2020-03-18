package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
	
		String str1="Welcome Syntax students";
		String str2="Welcome Syntax Students";
		
		//to compare 2 Strings
		System.out.println("-----equals() equalIgnoreCase() FUNCTION-----");

		System.out.println(str1.equals(str2)); // result is false because upper & lower case student
		System.out.println(str1.equalsIgnoreCase(str2));// result is true as case sensitivity is ignored
	
	System.out.println("------------actual vs  expected---------");
	
	String expected="  Home - Syntax Technologies ";
	String actual="  Home - Syntax Technologies  ";
	
	if (actual.equals(expected)) {
		System.out.println("Test case pass. Titles are matched");
	}else {
		System.out.println("Test case fails. Titles are NOT matched");
	}

	System.out.println("---------with trimming---------");
	if (actual.trim().equals(actual.trim())) {
		System.out.println("Test case pass. Titles are matched");
	}else {
		System.out.println("Test case fails. Titles are NOT matched");
	}

	String browser=" CHROME  ";
	if (browser.trim().equalsIgnoreCase("Chrome")) {
		System.out.println("The browser that I use is chrome browser");
	}
	}

}
