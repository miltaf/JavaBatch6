package com.syntax.class10;

public class RetrievingValuesFrom2Darray {

	public static void main (String[] args) {
		
		String month[][]= {
					{"January", "February", "December", "Hi", "Hello"},
					{"March", "April", "May"},
					{"June","July", "August", "Monkey"},
					{"September", "October", "November"}
	};

	int rows=month.length; // how many arrays
	int firstArray=month[2].length;
	System.out.println(firstArray);

	for (int i=0; i<month.length; i++) {
		for (int j=0; j<month[i].length; j++) {
			System.out.print(month[i][j]+" ");
		}
	}
	}
}
