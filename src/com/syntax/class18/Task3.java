package com.syntax.class18;

public class Task3 {
/* write a program that will have 4 different access levels of
 * constructors and create 3 objects of this class:
 * 1. inside same class
 * 2. from outside the class
 * 3. from different class inside different package and observe results
 */

	String name;
	int a, b;
	
protected Task3(int num, int num1) {
	System.out.println("protected constructor");
}
	private Task3(String str) {
	System.out.println("Test Task3 with addition to b");
}

Task3 (char b) {
	System.out.println("life is not easy mentioned in " +'b');
}


public Task3 (String named, int alpha, int brave) {
name=named;
a=alpha;
b=brave;
}
}
