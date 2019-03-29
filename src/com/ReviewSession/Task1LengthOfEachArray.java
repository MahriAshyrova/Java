package com.ReviewSession;

public class Task1LengthOfEachArray {

	public static void main(String[] args) {
		// print the length of each array

	int [] [] ar= {{1, 2,3}, {4, 5, 6, 9}, {7, 8}};
	
	for (int i=0; i<ar.length; i++) {
		System.out.println("The length of row "+(i+1)+ " = "+ar[i].length);
	}
	
	for (int[] inner: ar)	 {
		System.out.println("The length of row= "+inner.length);
	}
		
	for (int a=0; a<ar.length; a++) {
		for (int x=0; x<ar[a].length; x++) {
			System.out.print(ar[a][x]+", ");	
		}
		System.out.println();
	}
	
	for (int[] all:ar) {
		for (int elements:all)
		System.out.print(elements+", ");	
	}
	System.out.println();
	}

}
