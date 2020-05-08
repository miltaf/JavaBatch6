package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmpTest {

		  public static void main (String[] args){

		Set<Employee>employees=new LinkedHashSet<>();

		employees.add(new Employee("John Doe", 123456789, 80000.0));
		employees.add(new Employee("Jane Smith", 987654321, 90000.0));
		employees.add(new Employee("Jacie Chan", 0, 1000000.0));
		 
		 Iterator<Employee>emp=employees.iterator();
			
			while (emp.hasNext()){
			  System.out.println(emp.next());
			  
			}
				
		  }
	
}
