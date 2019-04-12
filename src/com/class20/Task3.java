package com.class20;

public class Task3 {
	
	private String name= "John";
	String name1="Bilal";
	protected String name2 ="Asha";
	public String name3="Tetiana";

	public static void main(String[] args) {
		
		
		
		Task3 obj=new Task3();
		
		String newString =obj.reverseString("I like liliacs");
		System.out.println(newString);
		
		boolean isPalidrome=obj.isPalindrome("mom");
		
		System.out.println(obj.isPalindrome("mom"));
		System.out.println(obj.isPalindrome("sister"));
		
		obj.sayHello();

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
	
	void sayHello() {
		System.out.println("Hello!");
	}

}
