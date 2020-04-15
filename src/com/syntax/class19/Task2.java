package com.syntax.class19;

public class Task2 {
	int num1, num2;
	
	public void printDetails() {

		if (num1 % 2 == 0 && num2 % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void main(String[] args) {

		Task2 bothEven = new Task2();
		bothEven.printDetails();


	}
}
