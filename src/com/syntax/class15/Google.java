package com.syntax.class15;

public class Google {

	// define features such as emp id, name, last name, salary
	// define a behavior
	
	int empId;
	double salary;
	
	String name, lastName, title;
	
	void working() // method header--> defining behavior in the form of method
	{
		System.out.println(title+" is working");
	}
	void getpaid() {
		System.out.println(name+ "is getting paid "+salary);
	}
	void attendMeetings() {
		System.out.println(name+ " attending meetings");
	}
	
	public static void main (String[] args) { // to access the class and method, this main method is required
		Google emp1=new Google(); //this is the object created to access reference variables
		emp1.empId=123;
		emp1.lastName="John";
		emp1.lastName="Smith";
		emp1.title="CEO";
		emp1.salary=200000;
		
		emp1.working();
		emp1.getpaid();
		emp1.attendMeetings();
		
		Google emp2=new Google();
		emp2.empId=124;
		emp2.lastName="Seyma";
		emp2.title="QA Engineer";
		emp2.salary=100000;
		emp2.working();
		emp2.getpaid();
		emp2.attendMeetings();
		
		//emp2.playing(); CE: define playing method in the class
	}
}
