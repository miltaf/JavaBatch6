package com.syntax.class22;

public class Person {

	public static String name, lastName;
	  public static int age;
	  

	  }
	  
	  class EMP extends Person{
		  int salary;
		  public void display() {
	    	      System.out.println(name+" "+lastName+" "+age+" "+salary);
	    }
	    }
	  
	  class Student extends Person{
	    int grade;
	    
	 public void display(){
	 System.out.println(name+" "+lastName+" "+age+" "+grade);
	  
	    }
	  }
	  
	  class Retiree extends Person{
		  String seniorActivity;
		
		  public void display(){
	      System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	  }
	}
	