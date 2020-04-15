package com.syntax.class20_1;

public class Calling2DSum {
public static void main(String[] args) {
	

int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	int sum=0;
	for(int i = 0;i<a.length;i++)
	{
	sum=sum+a[3][i];
	}


		System.out.println(sum);
	}
}


