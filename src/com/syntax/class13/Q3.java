package com.syntax.class13;

public class Q3 {

	public static void main(String[] args) {
		/* write java program to print first 10 numbers of Fibbonacci series
		 * the sum of previous two numbers is fibonacci
		 *  0 1 1 2 3 5 8
		 */
		int a,b,c;
		a=0;
		b=1;
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		
	}
	}
}