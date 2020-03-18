package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {

		String alpha = "Today we are learning !@ character, right?";
		String[] arial = alpha.split("[A-Za-z]");
		System.out.println(arial.length);

		String a = ("Ist it Saturday?, Is it raining?, Do we have a Java Class?");
		String[] sentence = a.split("[?]");
		System.out.println(sentence.length);

		System.out.println("-----------.a..a.-------------------");

		String today = "Today is my favorite Java clas";

		String[] array = today.split("my");
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);

		String today1 = "Today is my favorite Java class";

		String[] stringArray = today1.split("a");
		// print all elements from array one by one
		// element type variableName:name of array

		for (String arr : stringArray)
			System.out.print(arr + "|");

	}

}
