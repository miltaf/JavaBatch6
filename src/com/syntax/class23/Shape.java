package com.syntax.class23;

public interface Shape {
//	Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
//	Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
	 void calculateArea(int r);
	 void calculatePerimiter(int r);
}
class Circle implements Shape{
	@Override
	public void calculateArea(int r) {
		Double area = Math.PI * r * r;        
        System.out.println("Area of circle = "+area);
	}
	@Override
	public void calculatePerimiter(int r) {
		double perimeter = 2 * Math.PI * r;
		 System.out.println("Perimeter of Circle is: " +perimeter); 
	}
}
class Square implements Shape{
	@Override
	public void calculateArea(int r) {
		double result=r*r;
		System.out.println("The area of Square is "+result);
	}
	@Override
	public void calculatePerimiter(int r) {
		double result1=r*4;
		System.out.println("The primiter of square is "+result1);
	}
}

