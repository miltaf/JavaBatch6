package com.syntax.class14;

public class Car {

		// define features of the car in the form of variables
	
		String make;
		String model;
		int year;
		String color;
		int speed;
		
// define behaviors
		void drive() {
			System.out.println(make+" can drive");
		}
		void accelerate() {
			System.out.println(make+ " can accelerate");
		}

		void makeNoise() {
			System.out.println(make+ "make noise");
		}
		void stop() {
			System.out.println(make+ " stop when applies brakes");
			System.out.println("Car stops");
		}
}
