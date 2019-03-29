package com.class11;

public class Creating2DArray {

	public static void main(String[] args) {
		// creating 2D arrays

		
	int[][] d=new int[4][4]; //4*4=16 elements
	
	//1 row
	d[0][0]=12;
	d[0][1]=13;
	d[0][2]=14;
	d[0][3]=15;
	
	//2 row
	d[1][0]=1;
	d[1][1]=2;
	d[1][2]=3;	
	d[1][2]=4;
	
	//3 row
	
	d[2][0]=5;
	d[2][1]=10;
	d[2][2]=15;	
	d[2][2]=20;	
	
	//4 row
	
	d[2][3]=100;
	d[2][3]=200;
	d[2][3]=300;	
	d[2][3]=400;	
	
	
	System.out.println(d[1][2]);
	System.out.println(d[2][3]);
	
	
	
		
	}

}
