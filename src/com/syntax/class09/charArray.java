package com.syntax.class09;

import java.util.Scanner;

public class charArray {

	public static void main (String[] args) {
	char[] a;
	a=new char[6];
	a[0]='A';
	a[1]='B';
	a[2]='C';
	a[3]='D';
	a[4]='E';
	a[5]='F';
	System.out.println(a[1]);
	System.out.println(a.length);
	
	System.out.println("----------------2nd way-------------");
	
	char[]b= {'A', 'B', 'C', 'D', 'E', 'F'};
	System.out.println(b[1]);
	System.out.println(b.length);
	
	for (char alpha : b) {
		System.out.print(alpha+" ");
	}
	System.out.println();
	System.out.println("----------------1st way-------------");
	
	String[]names;
	names=new String[5];
	names[0]="Brianney";
	names[1]="Evelyn Vuong";
	names[2]="Shukrat Mulladhzhanov";
	names[3]="Mahboobullah Iltaf";
	names[4]="Mirzo";
	
	System.out.println(names[3]);
System.out.println(names.length);

	System.out.println("----------------2nd way-------------");
String[] names1= {"Brianney", "Evelyn Vuong", "Shukrat Mulladhzhanov", "Mahboobullah Iltaf", "Mirzo"};

System.out.println(names1[3]);
System.out.println(names1.length);

for (int i=0; i<names1.length; i++) {
	System.out.print(names1[i]+" ");
}
System.out.println();
System.out.println("----------------Advanced for Loop-------------");
for (String noom : names1) {
	System.out.print(noom+" ");
}

System.out.println();
System.out.println("----------------Array of Words-------------");

String[] words= {"Java", "Saturday", "day", "coding", "is"};
System.out.print(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]+".");
System.out.println();
System.out.println(words.length);

for (String w :  words) {
	System.out.println(w);
}

Scanner scan=new Scanner (System.in);

int [] array= new int[5];
for (int i=0; i<5; i++) {
array[i] = scan.nextInt();

for (int y : array) {
	System.out.println(y*10);
}
System.out.println();
}
	
	}

}
