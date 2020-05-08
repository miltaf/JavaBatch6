package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
	/* create an arraylist of words. 
	 * Remove every word that ends with "e". Use iterator
	 */
	 
	public static void main (String[] args) {
		
		ArrayList<String> word=new ArrayList<>();
		word.add("book");
		word.add("me");
		word.add("bee");
		word.add("speak");
		word.add("sellinnium");
		word.add("queue");
		
		Iterator<String>iterate=word.iterator();
		while(iterate.hasNext()) {
			String variable=iterate.next();
			if (variable.endsWith("e")) {
				iterate.remove();
		}
	}
		System.out.println(word);
}
}