package com.syntax.class22;

public class PersonTest {


	  public static void main (String[] args){
	    
	    EMP emp=new EMP();
	    emp.name="Joe";
	    emp.lastName="Smith";
	    emp.age=35;
	    emp.salary=35000;
	    emp.display();
	    
	    Student st=new Student();
	    st.name="Adam";
	    st.lastName="Smith";
	    st.age=15;
	    st.grade=10;
	    st.display();
	    
	    Retiree ret=new Retiree();
	    ret.name="Frank";
	    ret.lastName="Smith";
	    ret.age=15;
	    ret.seniorActivity="tour";
	    ret.display();
	  }
		
	}

