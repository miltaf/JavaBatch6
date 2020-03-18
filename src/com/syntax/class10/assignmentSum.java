package com.syntax.class10;

public class assignmentSum {

	public static void main(String[] args) {


		
		
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};

	for(int i = 0; i < a.length && i % 2 == 0; i++) {
      for(int y = 0; y < a[i].length && y % 2 != 0; y++) {
                if(y % 2 != 0 && i % 2 == 0) {
                a[i][y] = y + 1;

                }   
      }	
      System.out.println(a[i]);
	}
}
}
