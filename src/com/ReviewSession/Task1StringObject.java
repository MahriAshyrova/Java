package com.ReviewSession;

public class Task1StringObject {
	
	public static void main(String[] args) {
		
		/* Create a String method called ReverseString
	     *  method return the string you hard coded
	     * in reverse order(This is the static way)
	     * have the string you will create will say
	     *  "seigolonhceT xatnyS"
	     */ 
		
		Task1StringObject task1=new Task1StringObject();
		task1.reverseString();	

	}

	void reverseString() {
		
		String str="Syntax Technologies";
		String reverse="";
		
		for (int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		System.out.println(reverse);
	}
	
	
	
}
