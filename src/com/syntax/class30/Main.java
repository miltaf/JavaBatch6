package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

class Main {
  public static void main (String[] args){
    
    Map<String, String>map=new HashMap<>();
    map.put("ONE", "AAA");
    map.put("TWO", "BBB");
    map.put("THREE", "CCC");
    map.put("FOUR", "DDD");
    map.put("FIVE", "EEE");
    
    System.out.println("HashMap Before Remove :");
   
    Set<Entry<String, String>>allEntries=map.entrySet();
    
    for (Entry<String, String> enterA: allEntries){
        String key1=enterA.getKey();
   String value1=enterA.getValue();
		 System.out.println(key1+" : "+value1);
    }	
   
    System.out.println("-----------------");
    
    System.out.println("HashMap After Remove :");
    map.remove("ONE");
    map.remove("FOUR");
    for (Entry<String, String> enterAll: allEntries){
          String key=enterAll.getKey();
     String value=enterAll.getValue();
		 System.out.println(key+" : "+value);
		
    
      
    }
  }

}