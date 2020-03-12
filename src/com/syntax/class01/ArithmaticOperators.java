package com.syntax.class01;

public class ArithmaticOperators {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 10;

		int sum = num1 + num2;

		double num3 = 10.99;
		double num4 = 11.99;
boolean isTrue;
boolean isFalse;
isTrue=false;
isFalse=false; 
System.out.println(isTrue);
System.out.println(isFalse);

		double sum1 = num3 + num4;

		double sum2 = num1 + num4;

		int sub = num1 - num2;

		int mult = num1 * num2;

		int div = num1 / num2;

		// The result of the division of num1 and num2 is=____

		System.out.println("the result of the division of num 1 and num 2 is=" + div);

		// The result of the summation of num 1 and num2 is =____
		System.out.println("The result of the summation of num1 and num2 is=" + sum);

		// The result of the subtraction of num 1 and num 2 is=____
		System.out.println("the result of the subtraction num1 and num2 is=" + sub);

		// The result of the multiplying of num 1 and num2 is=_____
		System.out.println("The result of the multiplying num1 and num2 is=" + mult);

		// The result of the summation num1 and num4 is=_______
		System.out.println("The result of the summation of num1 and num4 is=" + sum2);

		// The result of the summation of num3 and num4 is =
		System.out.println("The result of the summation of num3 and num4 is=" + sum1);

		int fan = (10 + 10) * 10;
		int fan1 = 10 + 10 * 10;

		System.out.println(fan);
		System.out.println(fan1);
		
		int fan2 = 10*10+20/5;
		System.out.println(fan2);
		
		int fan3=10*(10+20)/5;
		System.out.println(fan3);
		
		float f=12.50f;
		float f1=2.7f;
		
		float result=f/f1;
		System.out.println(result);
		
		
		int v=16;
		int w=9;
		
		int mod=v%w;
		System.out.println(mod);
		
		int i=12;
		int y=7;
		
		int result1=i/y;
		double result2=i/y;
		
		System.out.println(result1);
		System.out.println(result2);
		
		double nambar2=12;
		System.out.println(nambar2);
		

		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter = 2 * (width + height);

		System.out.println("The premiter of a rectangel with width " + width + " and height " + height + " is equal to "
				+ perimeter + " and the area is " + area);

	}
}
