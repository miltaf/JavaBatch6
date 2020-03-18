package com.syntax.class12;

public class MoreStringFunctions {
public static void main (String[] args) {
	String me = "I am a good tester!";
	System.out.println("------------replace() FUNCTION----------");
	String newString=me.replace("a", "c");
	System.out.println(newString);
	//if it finds matching char sequence --> then replace
	me=me.replace("good", "great");
	System.out.println(me);
	
	//if it is not finding matching sequence --> not replace
	me=me.replace("great", "awesome");
	System.out.println(me);
	
	System.out.println("------------replaceAll() FUNCTION----------");
	String str="I am the best of 100!!!";
	str=str.replaceAll("[^A-Za-z0-9]", "");
	System.out.println(str);

	String syn="Today was interesting!";
	syn=syn.replaceAll("[^A-Za-z]", "");

}
}