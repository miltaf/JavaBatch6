package com.syntax.class10;

import java.util.Scanner;

public class Test1 {
public static void main (String[] args) {
	int[] i=new int[4];
	i[0]=20;
	i[1]=30;
	i[2]=40;
	i[3]=50;
	
for (int j=0; j<4; j++) {
	System.out.println(i[j]);
}
System.out.println("______________________");

Scanner scan=new Scanner (System.in);
System.out.println("How many elements do you want to store, buddy?");
int size = scan.nextInt();

int[]nums = new int [size];

for (int w=0; w<size; w++) {
	System.out.println("Give me a number to store in the array.");
	nums[w] = scan.nextInt();
}
System.out.println("Let's see what you gave me:");
int sum=0;
for (int n : nums) {
	System.out.println(sum+=n);
	
}

}
}
