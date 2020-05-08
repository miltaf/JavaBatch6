package com.syntax.class31;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Mapping {
public static void main (String[] args) {
	
	Map<Object, Object>obj=new HashMap<>();

	obj.put(1234, "pull");
	System.out.println(obj);
	
	Map<Object, Object>obj1=new Hashtable<>();
	
	obj1.put(1323, "pull");
	System.out.println(obj1);
}
}
