package com.syntax.class18;

public class Task2 {

	String name;
	int grade1, grade2, grade3;

	Task2(String studentName, int stGrade1, int stGrade2, int stGrade3) {
		name = studentName;
		grade1 = stGrade1;
		grade2 = stGrade2;
		grade3 = stGrade3;
	}

	public int gradeAverage() {
		int sumGrade = grade1 + grade2 + grade3;
		int avg = sumGrade / 3;
		return avg;
	}

	public static void main(String[] args) {

		Task2 s1 = new Task2("Ahmad", 85, 93, 95);
		System.out.println(s1.name + "'s average grade is: " + s1.gradeAverage());

		Task2 s2 = new Task2("Khalid", 75, 85, 98);
		System.out.println(s2.name + "'s avergae grade is: " + s2.gradeAverage());

		Task2 s3 = new Task2("Malalai", 100, 80, 90);
		System.out.println(s3.name + "'s average grade is: " + s3.gradeAverage());
	}
}
