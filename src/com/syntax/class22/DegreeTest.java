package com.syntax.class22;

public class DegreeTest {
	public static void main(String[] args) {

		Degree deg=new Degree();
		deg.diploma="high school diploma";
		deg.getPrerequisite();
		
		Bachelor bach=new Bachelor();
		bach.diploma="high school diploma";
		bach.getPrerequisite();
				
		Masters master=new Masters();
		master.bachelor="has bachelor degree";
		master.getPrerequisite();
	}
}
