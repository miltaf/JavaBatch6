package com.syntax.class10;

public class Array {

	public static void main(String[] args) {
		// average
		
		
		
	String[] cities= {"Washington", "New York", "Paris", "Miami", "Los Agenels"};
	
	
	// I live in Paris

	System.out.println("I live in "+cities[2]);

	int x=1;
	System.out.println(cities[x]);
	
	x+=3;
	System.out.println("I moved to "+cities[x]);
	
	System.out.println("----------------------------");

	  char[] alpha={'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};

	System.out.print(alpha [0], alpha [2]; alpha [4]; alpha [6]; alpha [8]; alpha [10]);

	
	//how many elements stored inside an array?
	int arraySize=cities.length;
	System.out.println("Total elements "+arraySize);

	System.out.println("----------------------------");
	
	//how can we access last element from an array?
	System.out.println(arraySize-1);

	System.out.println("----------------------------");
	// access all elements from an array
	/* citieis[0], cities[1], cities[2] - instead performing repetitive code,
	 * we can count it
	 */
	for (int i=0; i<arraySize; i++) {
		System.out.println(cities[i]);
	}
	}

}
