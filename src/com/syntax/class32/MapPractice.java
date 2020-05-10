package com.syntax.class32;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPractice {
	public static void main (String[] args) {
		
		Map<Integer, String>studentMap=new HashMap<>();
		
		studentMap.put(101, "john");
		studentMap.put(102, "Jason");
		studentMap.put(103, "Jordon");
		studentMap.put(104, "Jason");
		
		System.out.println(studentMap);
		System.out.println(studentMap.containsKey(102));
		System.out.println(studentMap.containsValue("Jordon"));
		
		System.out.println(studentMap.get(103));
		studentMap.replace(101, "Ibrahim");
		System.out.println(studentMap);
		studentMap.remove(101);
		System.out.println(studentMap);
		
		HashMap<Integer, String>hasel=new HashMap<>();
		hasel.put(11, "Ahmad");
		hasel.put(12, "Mahmood");
		hasel.put(13, "Ahmad");
		hasel.put(14, "Khalid");
		
		System.out.println(hasel);
		boolean flag = hasel.containsValue("Ahmad");
		System.out.println("String contains Ahmad :"+flag);
		boolean flag1=hasel.containsKey(12);
		System.out.println(flag1);
		
		Map<Integer, String> papa=new HashMap<>();
		papa.put(1, "Alpha");
		papa.put(2, "Bravo");
		papa.put(3, "Charlie");
		papa.put(4, "null");
		papa.putAll(null, "null");
		
		System.out.println(papa);
		
		Set<Integer> keys = papa.keySet();
		for (Integer key : keys) {
			System.out.print(key+" , ");
			System.out.println("key is "+key+" and value is "+papa.get(key));
		}
		
		
		Iterator<Integer>it=keys.iterator();
		while(it.hasNext()) {
			Integer k=it.next();
			System.out.println("key is "+k+" and value is "+papa.get(k));
		}
Set keys=new TreeSet();
		Collection<String>values=papa.values();
		for(String value: values) {
			System.out.println(value);
		}
		
		Set<Entry<Integer, String>>entrySet=papa.entrySet();
		System.out.println(entrySet);
		
		for(Entry<Integer, String>entry:entrySet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		Iterator<Entry<Integer, String>>entIt=entrySet.iterator();
		while(entIt.hasNext()) {
			Entry<Integer, String>ent=entIt.next();
			String entry=ent.getKey()+" ::: "+ent.getValue();
			System.out.println(entry);
		}
	}
}
