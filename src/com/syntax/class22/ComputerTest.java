package com.syntax.class22;

public class ComputerTest {
public static void main (String[] args) {
	
	Apple apple=new Apple("Apple");
	Computer lenovo=new Lenovo("Lenovo");
	Computer hp=new HP("HP");
	Computer dell=new Dell("Dell");
	
	Computer[] computers= {apple, lenovo, hp, dell};
	
	System.out.println("---------Accessing method for each loop-----");
	
	for (Computer comp:computers) {
		comp.display();
		comp.operate();
		
		System.out.println("**************");
	}
	
	//for (int i=0; i<computers.length; i++) {
		//computers[i].display();
		//computers[i].operate();

//		System.out.println();
	//}
	}

}
