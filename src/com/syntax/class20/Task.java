package com.syntax.class20;

public class Task {
	String schoolName;
	  int batch;
	  int year;
	  String lastDayOfClass;
	  
	    public Task(){
	    System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	  }

	  public Task(String schoolName, int batch, int year, String lastDayOfClass){
	 this.schoolName=schoolName;
	    this.batch=batch;
	    this.year=year;
	    this.lastDayOfClass=lastDayOfClass;
	}
	  public void display() {
		    System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);	}
}
