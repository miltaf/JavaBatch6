package com.syntax.class24;

public class repl {
	double total =0;
	
	final void method(){
		int[] a = {2,7,3,8,4};
	for (int i=0; i<a.length; i++){
	  total=total+a[i];
	}
	double avg=total/a.length;
	System.out.println(avg);
	}
		public static void main(String[] args) {
			
			repl rep=new repl();
			rep.method();
			 //should print 4.8
		}
	
}
