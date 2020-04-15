package com.syntax.class22;

public class Degree {

	String diploma;
	
	void getPrerequisite() {
		System.out.println("To get a degree, you need "+diploma);
	}
}
class Bachelor extends Degree{
	
}
class Masters extends Degree{
	
	String bachelor;
	
	void getPrerequisite() {
		System.out.println("To get a masters degree, you need to have "+bachelor);
	}
}