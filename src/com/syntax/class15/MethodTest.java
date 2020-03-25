package com.syntax.class15;

public class MethodTest {
	public static void main(String[] args) {
		
		Method obj=new Method();
		obj.sayWelcome();
		obj.sayAnything("Hello", 2);
		obj.sayAnything("Bye", 20);
		//obj.sayAnything(10, "Hi");CE
		
		obj.isItRaining(true);
		obj.isItRaining(false);
		
	}
}
