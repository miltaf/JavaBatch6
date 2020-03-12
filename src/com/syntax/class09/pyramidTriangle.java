package com.syntax.class09;

public class pyramidTriangle {

	public static void main(String[] args) {
		// create a pyramid out of stars using for loop

		for (int r = 1; r <= 5; r++) {
			for (int c = 1; c <= r; c++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		
		for (int r=4; r>=1; r--) {
			for (int c=1; c<=r; c++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
System.out.println("-------------------------------------");	


for (int r=5; r>=1; r--) {
	for (int c=1; c<=r; c++) {
		System.out.print(r+" ");
	}
	System.out.println();
}


	}

}
