package com.class20;

public class Task3 {

	public static void main(String[] args) {
		
		
		
		Task3 obj=new Task3();
		
		String newString =obj.reverseString("I like liliacs");
		System.out.println(newString);
		
		boolean isPalidrome=obj.isPalindrome("mom");
		
		System.out.println(obj.isPalindrome("mom"));
		System.out.println(obj.isPalindrome("sister"));

	}
	
	protected String reverseString(String str) {
		
		String reversed="";

		for (int i=str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		return reversed;
	}
	
	
	public boolean isPalindrome(String str) {
		
		boolean flag=false;

		String reversed=reverseString(str);
		if(str.equalsIgnoreCase(reversed)) {
		flag= true;	
	} return flag;
	}

}
