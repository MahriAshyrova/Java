package com.class10;

public class Task2 {

	public static void main(String[] args) {
		// Create an array of names and store all names of your group. 
		// Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names = {"Mahri", "Aigerim", "Talgat", "Amina", "Sasha"};
		System.out.println("My name is "+names[0]);
		
		
		System.out.println();
		
		
		String[] names1=new String[5];
		
		names1 [0]="Mahri";
		names1 [1]="Aigerim";
		names1 [2]="Talgat";
		names1 [3]="Amina";
		names1 [4]="Sasha";
		
		System.out.println("My name is "+names[0]);
		
	}

}
