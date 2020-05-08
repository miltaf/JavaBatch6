package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Task2 {

	public static void main(String[] args) {
	 Map<Integer, String> BestBuy=new HashMap<>();
	 BestBuy.put(7664847, "Printer");
	 BestBuy.put(4840321, "Laptop");
	 BestBuy.put(2820328,"Mobile");
	 BestBuy.put(7879885,"TV");
	 
	 System.out.println(BestBuy);

	 Set<Entry<Integer,String>> allItems=BestBuy.entrySet();

	 for (Entry<Integer, String>items:allItems) {
		 Integer key=items.getKey();
		 String value=items.getValue();
		 System.out.println(key+" : "+value);
		 
	Iterator<Entry<Integer, String>>entry=allItems.iterator();
	while(entry.hasNext()) {
		Entry<Integer, String> e=entry.next();
		String keyValue=e.getKey()+" && "+e.getValue();
		System.out.println(keyValue);
	}
	 }
	}

}
