package com.syntax.class14;

public class Garage {

	public static void main (String [] args) {
		// build individual objects
		
		Car car1=new Car();
		
		car1.make="Lamborghini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="Blue";
	car1.accelerate();
	
		Car car2=new Car();
		car2.make="BMW";
		car2.model="m5";
		car2.year=2019;
		car2.color="Pink";
		car2.drive();
		
		Car car3=new Car ();
		car3.make="123";
		car3.speed=200;
		car3.accelerate();
		car3.makeNoise();
	}
}
