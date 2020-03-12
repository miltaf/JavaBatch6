package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] love) {
		
		int num=10;
		
		int num1;
		num1=10;
		
		// declare an array and initialize it
		
		int[] array = new int[4];
		
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		// access elements from an array
		
		System.out.println(array[1]);

		
		// 2nd way
		
		String[] carArray; // preferred way of writing a string variable array
		String carArray1[]; // you can also write: String carArray[]
		
		carArray=new String[3];
		carArray[0]="BMW";
		carArray[1]="Honda";
		carArray[2]="Toyota";
		// carArray[3]="Benz"; --> during run time java machine will give array indexOutOfBoundsException
		//System.out.println(carArray[3]); show the issue if we tend to print carArray[3];
		
		
	// I am driving Toyota
		
		System.out.println("I am driving "+carArray[2]);
		
		int [] numbers=new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		
		// change value of numbers[1]
		numbers[1]=2000;
	
		System.out.println(numbers[1]);
	
	
	// if we store less elements tha we declared
	// compiler will add default values
		
		String[] inClassStudents=new String[5];
		inClassStudents[1]="Hitchem";
		inClassStudents[2]="Ahmad";
		inClassStudents[3]="Khalid";
		inClassStudents[4]="Rafi";
		
		// inClassStudent[5]="Hitchemn"; --> will get ArraIndexOutOfBoundaryException
		
	System.out.println(inClassStudents[5]);
	}

}
