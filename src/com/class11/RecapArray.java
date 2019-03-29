package com.class11;

public class RecapArray {

	public static void main(String[] args) {
		// create an array of names that will hold 5 elements and retrieve all values from it 
		// 1 option creating an array
		String[] names=new String[7];
		
		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Arif";
		names[3] = "Weqas";
		names[4] = "Dzmitry";
		names[5] = "Shiva";
		names[6] = "Sandesh";
		//names[6] = "Asel"; will get a runtime exeption when tryong to access it 
		
		for (int i=0; i<names.length; i++) {
		System.out.println(names[i]);
		}
		
		System.out.println("------------for loop-----------");
		
		//2 options create an array using array literal
		
		String [] studentNames = {"Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank"};
		
		for (int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
		System.out.println("------Advanced for loop------------");
		
		//retrieve values using: advanced for loop, for each loop, enhanced for loop, always used with array
		
		for (String student :studentNames) {
			System.out.println(student);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
