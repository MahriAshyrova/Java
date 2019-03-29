package com.class11;

public class TASK1 {

	public static void main(String[] args) {
		// CREATE AN ARRAY OF CARS AND STORE 6 ELEMENTS INTO IT. USING 2 DIFFERENT LOOPS PRINT ALL VALUES FROM THE ARRAY
		
		String[] cars= {"Volvo", "Toyota", "MBenz", "Mustang", "RangeRover", "Lexus"};
		for (String array :cars) {
			System.out.print(array+ " ");
		}

		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
		
		
	}

}
