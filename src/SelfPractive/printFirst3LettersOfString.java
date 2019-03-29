package SelfPractive;

import java.util.Scanner;

public class printFirst3LettersOfString {

	public static void main(String[] args) {
		// Given a String banana do the following:
		//Print out the following: "The first 3 letters of ___ is ___"
		//	For example, if the input is "banana", your output should be "The first 3 letters of banana is ban"

		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("In: ");
		 String word=scan.nextLine();
		    
		    String newString=word.substring(0,3);
		    
		    System.out.println("The first 3 letters of "+word+" is "+newString);	
		
		
		
		
		
		
		
	}

}
