package com.syntax.class17;

public class CallingMethod {

	public static void main (String[] args) {
		Method m=new Method();
		
		int sum=0;
		
		for (int i = 1; i <m.nums.length; i++) {
		sum= sum+m.nums[i];
					} 
		System.out.println(sum);
		
		System.out.println("-------------calling string reverse-----------");
		
		Method m1=new Method();
		
		for (int i=m1.name.length()-1; i>=0; i--) {
			m1.letter = m1.name.charAt(i);
			System.out.print(m1.letter+" ");
		}
		
			
	}}
