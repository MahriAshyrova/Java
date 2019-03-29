package SelfPractive;

public class SumOfARow2DArray {

	public static void main(String[] args) {
		// Write a program to sum the elements in the third row.
		
		
		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
		
		
		int rowThree =0; 
		
		for (int i=0; i<a[2].length; i++) {
			rowThree+=a[2][i];
		}
		
		System.out.println(rowThree);
		

	}

}
