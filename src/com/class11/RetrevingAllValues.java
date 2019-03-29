package com.class11;

public class RetrevingAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [][] num= {
			{11, 12, 13, 14},
			{21, 22, 23, 44},
			{31, 32, 33, 34},
	};
	
	int rows=num.length;
	System.out.println(rows);
	int cols=num[1].length;
	System.out.println(cols);
	
	System.out.println("------------------------------------");
		
	for (int row=0; row<num.length; row++)	{
		for (int col=0; col<num[row].length; col++)
			System.out.print(num[row][col]+" ");	
	}
		System.out.println();
		
	}

}
