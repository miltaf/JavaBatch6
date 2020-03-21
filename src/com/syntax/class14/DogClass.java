package com.syntax.class14;

public class DogClass {
	
	String breed;
	String color;
	String name;
	int age;
	
	public static void main (String[] args) {
		DogClass dog1=new DogClass();
		
		dog1.breed="Shih tzu";
		dog1.color="yellow";
		dog1.name="Lucy";
		dog1.age=2;
		dog1.bark();
		DogClass dog2 = new DogClass();
		
		dog2.breed = "Neopolitan Mastiff";
		dog2.color="Black";
		dog2.name="Maak";
		dog2.age=3;
		dog2.eat();
		dog2.run();
		
		System.out.println(dog2.breed);
		System.out.println(dog1.name);
		
	}

	void eat() {
		System.out.println("Dog can eat");
		System.out.println(name+" can eat");
	}
	void bark() {
		System.out.println("Dog can bark");
	System.out.println(name+" can bark");
	}
		void run() {
			System.out.println("Dog can run");
		}
	
}
