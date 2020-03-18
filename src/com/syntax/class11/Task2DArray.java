package com.syntax.class11;

public class Task2DArray {

	public static void main(String[] args) {
		
		/* Create an array of cars: American, German, Korean, Italian
		 * Then retrieve all values from that array using 2 different loops
		 */

	String[] cars= {"American", "German","Korean","Italian"};
	
	for (int c=0; c<cars.length; c++) {
		System.out.println(cars[c]);
	}
		
	System.out.println("---------------end-------------------------");
	/*Create an array of countries: North Amercian countries, south american countries
	 * Europe countries, Asian countries, African countries. 
	 * Then print all values from that array using 2 different loops and 
	 * calculate how many total countries have been stored
	 */
				
	String [][] continental= {
			{"Gautemala","ElSalvador","Mexico"},
			{"Canada", "Brazil"},
			{"Germany", "Italy", "UK","Holland"},
			{"Afghanistan","Pakistan","India","UAE"}
	};
	int count=0;
	for (String[]countries:continental) {
		for (String world:countries) {
			System.out.print(world+" ");
		count++;
		}
		System.out.println();
	}
	System.out.println("total= "+count);
	}

}
