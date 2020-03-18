package com.syntax.class10;

public class Array2DEvenSum {
public static void main (String[] args) {
	int[][] a = {
			{5,2,3,7},
			{1,5,2,2},
			{1,5,3,4}
		};
		 
		int rtotal=0;
		
		for (int i=0; i<a.length; i++){
		  rtotal += a[2][i];
}		
System.out.println(rtotal);

}
}
