package com.class17_2;

public class NestedLoopsTask {

	public static void main(String[] args) {
		
		 NestedLoopsTask nest=new  NestedLoopsTask();
		 nest.print1();
		 nest.print2();
		 nest.print3();
		
	}	
	void print1() {
		//I want to print a pattern 
			//12345; 4 rows, 5 columns
			//12345; 
			//12345;
			//12345;
		for (int i=0; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i=0; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i=0; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
	}	
		
	void print2() {	
	for (int i=1; i<5; i++)	{
		for (int y=1; y<6; y++) {
			System.out.print(y);//12345
		}
		System.out.println();
	}
		
	}	
	void print3() {
	//I want to print a pattern 
			//1111111; 4 rows, 5 columns
			//2222222; 
			//3333333;
			//4444444;
			//5555555;
			//6666666;
			//7777777;
	System.out.println();
	
	for (int i=1; i<=7; i++)	{
		for (int y=1; y<7; y++) {
			System.out.print(i);//1111111 //2222222
		}
		System.out.println();
	}
	
	
	}
	
		
	

}
