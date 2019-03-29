package com.class7;

public class IncrementandDecrement {

	public static void main(String[] args) {
		 // post increment a++;         
		
		int a =299;
		int b=a++; //first assign --> increment(int b=a; a=a++ or a=a+1)
		
		System.out.println(a); //300
		System.out.println(b); //299
		
		System.out.println();
		
		int x=10;
		int y=x;
		System.out.println(x+" "+y);	
		
		System.out.println();
		
		//post decrement x--;
		
		int z=10;
		int c=z--;
		
		System.out.println(c);//10
		System.out.println(z);//9
		
		
		
		
	}

}
