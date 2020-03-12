package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberScannerLoop {

	public static void main(String[] args) {

Scanner scan;
int num=1;
int luckyNumber=17;
scan = new Scanner(System.in);

do { 
	System.out.println("Please enter any number from 1 to 20");
	num=scan.nextInt();
	}
while (num!=luckyNumber); 
	System.out.println("Congratulations!");
		

	}

}
