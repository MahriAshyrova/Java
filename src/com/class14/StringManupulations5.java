package com.class14;

public class StringManupulations5 {

	public static void main(String[] args) {
		
		// toCharArray()- convers String to array of characters
		
		String str="saturday";
		char [] array=str.toCharArray();
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);	
		}
		
		
		for (char c:array) {
			System.out.print(c);
		}
		
		System.out.println();
		
		for(int i=array.length-1;i>=0; i--) {
			System.out.println(array[i]);	
		}	

	}

}
