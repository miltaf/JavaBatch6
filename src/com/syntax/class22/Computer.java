package com.syntax.class22;

public class Computer {

	String make;
	public Computer(String make) {
		this.make = make;
	}
	
	public void display() {
		System.out.println("I have "+ make);
	}
	
	public void operate() {
		System.out.println(make+ " operates with Operating system");
	}
}

class Apple extends Computer{
	public Apple(String make) {
super (make);
	}
	public void operate() {
		System.out.println(make +" operates with IOS");
	}
}

class Lenovo extends Computer{
	public Lenovo(String make) {
		super(make);
	}
	
	public void operate() {
		System.out.println(make+" operates in beta version of OS");
	}
}

class HP extends Computer{
	
	public HP(String make) {
		super(make);
	}
	
	public void operate() {
		System.out.println(make+" operates in Windows 10");
	}
}

class Dell extends Computer{
	public Dell (String make) {
		super(make);
	}
	
	}
