package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class InterviewQuestion {

public static void main (String[] args) {
	List<String> aList=new ArrayList<>();
	aList.add("John");
	aList.add("Janes");
	aList.add("James");
	aList.add("Jasmine");
	aList.add("Jasmine");
	aList.add("Janes");
	aList.add("James");
	
	Set<String> set=new LinkedHashSet<>();
	set.addAll(aList);
	System.out.println(set);
}
}
