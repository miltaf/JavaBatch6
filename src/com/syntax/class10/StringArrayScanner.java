package com.syntax.class10;

public class StringArrayScanner {

	public static void main(String[] args) {

		String[] name = new String[3];
		name[0]="Ahmad";
		name[1]="Khalid";
		name[2]="Mahmood";
		
		for (int i=0; i<name.length;i++) {
			System.out.println(name[i]+", ");
		}
		System.out.println();

		int [] num = {45, 78, 12, 67, 55, 89, 23, 77, 88};
	
	for (int i=1; i<num.length; i+=3) {
		System.out.print(num[i]+" ");
	}
	}

}
