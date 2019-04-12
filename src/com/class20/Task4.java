package com.class20;

public class Task4 {

	public static void main(String[] args) {
		
		Task4 obj=new Task4();
		String [] array= obj.getWords("Hello Students!");
		
		
		for (int i=0; i<=array.length-1; i++) {
			System.out.println(array[i]);
			}
		
		for (String word:array) {
			System.out.println(word);
		}
	}
	
	private String[] getWords(String str) {
		String [] words= str.split(" ");
		return words;
}
	
	
	
	
}

