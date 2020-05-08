package com.syntax.class29;

import java.util.LinkedHashSet;
import java.util.Iterator;

import java.util.Set;

class Student {

	public String name, lastName;
	int studentId;

	public Student(String name, String lastName, int studentId) {
		this.name = name;
		this.lastName=lastName;
		this.studentId = studentId;
	}

	public void display () {
		  System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId);
		  
	}

}

class Main {
	public static void main(String[] args) {

		Set<Student> students = new LinkedHashSet<>();

		students.add(new Student("Sumair", "Jawaid", 101));
		students.add(new Student("Asel", "Umurzakova", 102));
		students.add(new Student("Diego", "Juarez", 103));
		students.add(new Student("Sohil", "Aryan", 104));
		students.add(new Student("Alijon", "Nazarov", 105));
		
		Iterator <Student> student = students.iterator();
		System.out.println("Student details: ");		
		while(student.hasNext()) {
			Student st=student.next();
			st.display();

		}
	}
}
