package com.syntax.class09;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		//Create an array and store names of our classes
		
		String[] syntaxClasses= {"SDLC", "Manual Testing", "Java", "GIT"};
		// print saying: Today we have Java class
		
		System.out.println("Today we have "+syntaxClasses[2]+" class");

		double[] numbers= {100.99, 999.99, 90.90};
		// int [] num; compiler will give an erro
		// num{};
		
		System.out.println(numbers[2]);
	}

}
