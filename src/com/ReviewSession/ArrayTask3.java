package com.ReviewSession;

public class ArrayTask3 {
	public static void main (String[] args) {

		//Write a program to find the index of an array element.
		
		int[] array = {3, 10, 23, 55, 66};

	    int index = 0;

	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == 66) {
	            index = i;
	        }
	    }

	    System.out.println(index);	


}
}


// && (index == 0)

