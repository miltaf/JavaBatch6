package com.syntax.class29;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main (String[] args) {
		
		Set<String>countries=new TreeSet<>();
		countries.add("Afghanistan");
		countries.add("Kosov");
		countries.add("Angola");
		countries.add("United States");
		countries.add("Germany");
		System.out.println(countries);
		
		for (String country:countries) {
			System.out.println(country+",");
		}
		
		System.out.println();
		System.out.println("-------------");
		
		Iterator<String> country= countries.iterator();
		while(country.hasNext()) {
			System.out.println(country.next()+",");
		}
		System.out.println();
		System.out.println("******************");
	
	}
}
