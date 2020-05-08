package com.syntax.class30;



public class Employee{
  private String fullName;
  private int ssn;
  private double salary;
  
  Employee(String fullName, int ssn, double salary){
    this.fullName=fullName;
    this.ssn=ssn;
    this.salary=salary;
  }
  
  public String getFullName(){
    return fullName;
  }
  public int getSsn(){
    return ssn;
  }
  public double getSalary(){
    return salary;
  }
}

