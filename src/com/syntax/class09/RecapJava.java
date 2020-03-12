package com.syntax.class09;

public class RecapJava {

	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=3; j++) {
				System.out.println(i+" "+j);
			}
		}

		System.out.println("__________________________");
		// using nested loop to print 10 until 99
		
	for (int i=1; i<=9; i++) {
		for (int y=0; y<=9; y++) {
			System.out.println(i+""+y);
		}
	}
	System.out.println("__________________________");
	// print hour and minutes
	
for (int h=0; h<=23; h++) {
	for (int m=0; m<=59; m++) {
if (m<10) {
	System.out.println(h+":0"+m);
}
		System.out.println(h+":"+m);
	}
		
}	
		System.out.println("__________________________");
	
	// print hour and minutes
	
for (int i=0; i<=23; i++) {
	for (int y=0; y<=59; y++) {
		System.out.println(i+":"+y);
	}
}
	

System.out.println("__________________________");

// print odometer up to 9999
 
for (int i=0; i<=10; i++) {
	for (int j=0; j<10; j++) {
		for (int k=0; k<0; k++) {
			
		for (int z=0; z<10; z++) {
			System.out.println(i+""+j+""+k+""+z);
		}
	}
		}
		
}
}

}
