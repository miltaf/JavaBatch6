package com.syntax.class33;

import java.util.ArrayList;

public class ExceptionQuiz {

	public static void main(String[] args) {

		String[] strs = new String[2];

		int idx = 0;

		for (String s : strs) {

		                 strs[idx].concat(" element " + idx);

		                    idx++;

		}

		for (idx = 0; idx < strs.length; idx++) {

		                  System.out.println(strs[idx]);
		
		ArrayList myList = new ArrayList(); String [] myArray;

	       try{

	                        while (true){ myList.add("My String");

	                   }

	            } catch (RuntimeException re){

	                          System.out.println("Caught a RuntimeException");

	            } catch (Exception e){

	                                System.out.println("Caught an Exception"); }

	                              System.out.println("Ready to use");

	
}

}
