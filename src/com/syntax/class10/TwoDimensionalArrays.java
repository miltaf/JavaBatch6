package com.syntax.class10;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		int [][] numbers=new int [3][4];
		
		// 1st row
		
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][3]=40;
		
		// 2nd row

		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		
		//3rd row
		
		numbers[2][0]=1;
		numbers[2][1]=2;
		numbers[2][2]=3;
		numbers[2][3]=4;
	
		//print value 15, which is in 2nd row and 3rd column
		
		System.out.println(numbers[1][2]);
	
		
		// we have array of 3 signle dimensional arrays
		//creating 2d array using 2 way
	int [][] nums= {
			{10, 20, 30, 40}, 
			{5, 10, 15, 20}, 
			{1, 2, 3, 4}
			};
	System.out.println(nums[2][3]);//4
	
	for (int r=0; r<nums.length; r++) {
		for (int c=0; c<nums[r].length; c++) {
			System.out.print(nums[r][c]+" ");
		}
	}
	System.out.println();

	
	String month[][]= {
			{"January","February","December"},
			{"March", "April","May"}
};
	System.out.println(month[0][2]);

	for (int i=0; i<month.length; i++) {
		for (int y=0; y<month[i].length; y++) {
			System.out.print(month[i][y]+" ");
		}
	}
	System.out.println();
	
	
	
	
	int [][] scores = {
			{100, 80, 70, 75},
			{65, 60, 55, 50, 45},
			{40, 35, 30, 25, 20, 15}
	};
	
	for (int row=0; row<scores.length; row--) {
		for (int col=0; col<scores[row].length; col--) {
			System.out.print(scores[row][col]+" ");
		}
	}
	}

	}