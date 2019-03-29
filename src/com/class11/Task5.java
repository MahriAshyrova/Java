package com.class11;

public class Task5 {

	public static void main(String[] args) {
		// Create an array of countries: north american countries, south american countries, europe countries, asian coutries, african countries.
		//Then retreave all values from that array.

	String []	[] countries= {
			{"Mexico", "Costo Rico"},
			{"Brazil", "Argentina"},
			{"France", "Italy", "Spain"},
			{"China", "Korea"},
			{"Egypt", "Morocco", "UAR"}
			};
		
	
	for (int a=0; a<countries.length; a++) {
		for (int b=0; b<countries[a].length; b++) {
			System.out.print(countries[a][b]+" ");	
		}
		System.out.println();
	}
	
		
		
		
		
		
	}

}
