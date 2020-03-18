package com.syntax.class11;

public class Recap2dArray {

	public static void main(String[] args) {
		String [][] groceries= {
				{"cucumber", "potato", "carrot"},
				{"mango", "apple", "banana", "kiwi"},
				{"milk", "cheese","yogurt"}
				};

		System.out.println(groceries[1][2]);
		
		//get all values from 2D array
	//loop through rows
		for (int r=0; r<groceries.length; r++) {
			//loop through columns
			for (int c=0; c<groceries[r].length; c++) {
				System.out.println(groceries[r][c]+" ");
			}
			System.out.println();
		}
	System.out.println("---GETTING ELEMENTS USING ADVANCED FOR LOOP---");
	//for loop through all arrays
	for (String[] ary:groceries) {
//for loop through each single array
		for (String items: ary) {
			System.out.print(items+" ");
		}
	System.out.println();
	}
	}

}
