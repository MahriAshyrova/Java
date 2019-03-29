package com.ReviewSession;

public class Task3Array {

	public static void main(String[] args) {
		//   Find the number of values above the value of 7.
		
		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };

		
	int count=0; 
	
	for (int i=0; i<rating.length; i++) {
		for(int y=0; y<rating[i].length; y++) {
			if (rating[i][y]>7) {
				count++;
			}
		}
	}
		System.out.println(count);
		
		int high=0;
		for (int[] inner:rating) {
			for (int element:inner) {
			if (element>7) {
			high++;	
			}
		}
		}
		System.out.println("The number of all elements above 7 is " +high);
	}

}
