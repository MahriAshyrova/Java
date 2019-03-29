package com.class11;

public class Task4 {

	public static void main(String[] args) {
		// Create an array of cars: american cars, german cars, korean cars, italian cars. Then retreave all values from that array. 
		
		String [] [] cars= {
				{"Subaru", "Ford", "GMC"},
				{"BMW", "Volvo", "MBenz", "Audi"},
				{"Kia"},
				{"Fiat", "Ferrari", "Alph Romeo"},
			
				};
		
		for (int a=0; a<cars.length; a++) {
			for (int b=0; b<cars[a].length; b++) {
				System.out.print(cars[a][b]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
