package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task {
	public static void main(String[] args) {
		
		Map<String, String> countries=new TreeMap<>();
		
		countries.put("Afghanistan", "Kabul");
		countries.put("Pakistan", "Islamabad");
		countries.put("Tajikistan", "Dushanbe");
		countries.put("India", "New Delhi");
		countries.put("England", "London");
		countries.put("USA", "Washington");
		countries.put("Canada", "Ottawa");

		for (String key: countries.keySet()) {
		System.out.println(key);
	}
	System.out.println("--------------------");
	for (String value: countries.values()) {
	System.out.println(value);
	}
	
	System.out.println("************");
	
	Iterator<String> capitals = countries.values().iterator();
	while (capitals.hasNext()) {
		System.out.println(capitals.next());
	}
	}
	
}