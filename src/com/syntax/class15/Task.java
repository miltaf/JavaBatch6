package com.syntax.class15;

public class Task {
	String hello=null;
	void number(int x, int y) {
		if (x>y) {
			System.out.println(x+" is larger than "+y);
		}else {
			System.out.println(y+" is larger "+x);
		}
	}
	void evenOdd(int num) {
		if (num%2==0) {
			System.out.println(num+" is odd number");
		}else {
			System.out.println(num+" is even number");
		}
	}
	void sayHello(String country) {
		switch (country) {
		case "Saudi Arabia":
		System.out.println("Kaifa Haloka");
		break;
		case "Pakistan":
		hello="kaisai ho";
		break;
		case "Afghanistan":
		hello="chetor asti";
		break;
		case "France":
		hello="Bonjo";
		break;
		default:
		hello=country+"'s sayHello not registered";
		}
	System.out.println(hello);
	}

		
	
}
