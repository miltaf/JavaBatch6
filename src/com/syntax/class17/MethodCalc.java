package com.syntax.class17;

public class MethodCalc {

	public int add (int num1, int num2) {
		int addition = num1 + num2;
		return addition;
	}
	
	protected void addNoReturn (int num1, int num2) {
		int addition = num1 + num2;
		System.out.println("Printing the result ");
	}
	int multiply (int num1, int num2) {
		return num1 * num2;
	}
	
	int divide (int num1, int num2) {
		return num1/num2;
	}
public static void main (String [] args) {
	MethodCalc addition = new MethodCalc (); 
		System.out.println(addition.add(2, 4));
MethodCalc multiplication = new MethodCalc ();

System.out.println(multiplication.multiply(2, 6));
}

}
