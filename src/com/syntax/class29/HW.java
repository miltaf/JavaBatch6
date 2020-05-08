package com.syntax.class29;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HW {
public static void main (String[] args) {
	Map <Integer, String>floor=new HashMap<>();
	floor.put(1, "Google");
	floor.put(2, "Syntax");
	floor.put(4, "Ebay");
	floor.put(4, "IBM");
	floor.put(3, "Comsis");
	floor.put(6, "Amazon");
	floor.put(5, "Tesla");
	floor.put(7, "IBM");
	
	
	int size=floor.size();
	System.out.println("The building has "+size+" floors.");
	
	System.out.println(floor);

	//how to get all keys
	Set<Integer> keys=floor.keySet();
	System.out.println(floor.keySet());//print set
	
	System.out.println("---------getting using iterator------");

	Iterator<Integer>keysIt=keys.iterator();
	while(keysIt.hasNext()) {
		int key=keysIt.next();
		System.out.println("Key is "+key+" its value is "+floor.get(key));
		
	}
	
	floor.replace(4, "Yahoo");
	System.out.println(floor);

	floor.remove(7);
	System.out.println(floor);
	
	System.out.println("---------getting keys using for each loop------");

	for (int k: keys) {
		System.out.println("Key from building map is "+k+":"+floor.get(k));
	}
	
	//how to get all values
	Collection<String> values=floor.values(); //Iterable=collection
	
	System.out.println("----getting all values using for each loop--------");
	
	for (String v: values) {
		System.out.println("Values from collection "+v);
	}

	System.out.println("------getting all values using iterator----");

	Iterator<String>valuesIt=values.iterator();
	while (valuesIt.hasNext()) {
		System.out.println("Map values: "+valuesIt.next());
	}
}
}
