package com.class10;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of words: Java, Saturday, day, coding, is.
		//Print the following sentence using element of array: “Saturday is Java coding Day”.

		
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		String sentence=words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2];
		System.out.println(sentence);
		int size=words.length;
		System.out.println("The size of an array is "+size);
		
		System.out.println();
		
		
		String[] words1=new String[5];
		
		words1[0] = "Java";
		words1[1]="Saturday";
		words1[2]="day";
		words1[3]="coding";
		words1[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}

}
