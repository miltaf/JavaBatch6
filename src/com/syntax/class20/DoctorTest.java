package com.syntax.class20;

public class DoctorTest {

	public static void main (String[] args) {
		Doctor doc = new Doctor("Jamshid", 786);
		
		System.out.println("------------------");
		
		Dentist dent = new Dentist("Wali", 8383);
		dent.display();
		
		Dentist dent1 = new Dentist("Younossi", 236);
		dent1.display();
	}
}
