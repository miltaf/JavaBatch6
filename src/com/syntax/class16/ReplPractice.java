package com.syntax.class16;

public class ReplPractice {

		// create a template for a phone


	static String syntax;


	// return type, name, parameters

	static void displaySyntax() {
		System.out.println("Welcome to Syntax Technologies");
	}

	public static void main (String[] args) {

		// accessing static variables in a static way
		
		syntax="Welcome to Syntax Technologies";
		System.out.println(syntax);
		
		// accessing instance variables through the instance of the class
		// accessing static method in a static way
		displaySyntax();

		ReplPractice obj=new ReplPractice();
		obj.syntax="Welcome to Syntax Technologies";
		// accessing static method in non static way
		obj.displaySyntax();
				
		
		
}

}
