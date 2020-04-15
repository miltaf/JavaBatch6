package com.syntax.class26;

public abstract class Tea {

	String teaType;
	public Tea(){
	  this.teaType=teaType;
	}
	public abstract void addSugar();
	}

	class LemonTea extends Tea{
	  
	public void addSugar(){
	    System.out.println("For "+teaType+" we need 2 spoons of sugar");
	  }
	}

	class ChaiTea extends Tea{
	  		
	public void addSugar(){
	    System.out.println("For "+this.teaType+" we need 1 spoons of sugar");
	  }
	}
	
