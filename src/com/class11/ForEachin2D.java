package com.class11;

public class ForEachin2D {

	public static void main(String[] args) {
		// create a grocery list: fruits, veggies, dairy. 
	

	String [] [] groceries= {
			{"apples", "bannanas", "kiwis","oranges"},
			{"tomatoes", "cucumbers", "peppers", "cabbage"},
			{"cottage cheese", "yogurt", "coconut milk", "cheese"}
			};			
	
	
	for (int a=0; a<groceries.length; a++) {
		for (int b=0; b<groceries[a].length; b++ ) { 
	
		System.out.print(groceries[a][b]+", ");
		
		}
		System.out.println();
	}
	
	
	System.out.println("------------------------------");
	for (String[] list:groceries) {
		for (String item:list) {
			System.out.print(item+", ");
		}
		System.out.println();
	}
	
	
	}	
}

