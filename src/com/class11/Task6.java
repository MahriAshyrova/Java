package com.class11;

public class Task6 {

	public static void main(String[] args) {
		
		int [] [] arr= {
				{1, 2, 3,}, // 1 array with an index 0
				{10, 20, 30}, // 2 array with an index 1
				{100, 200, 300}, // 3 array with an index 2
				
		};
		//how many total arrays
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) { //0 //1 //2
				System.out.print(arr[i][j]+", ");
		
	}
			System.out.println();
	
}	
		System.out.println();
		
		System.out.println("2Darray--->1Darray---->int");
		System.out.println();
		
		System.out.println("------------For each array------------------");
		for (int[] singleArray:arr) {
			for(int numbers :singleArray) {
				System.out.print(numbers+" ");
			}
			System.out.println();
		}

	}

}





