package com.class26;

public class ThisWithConstructor {
	
	// this() - calls a current constructor---> constructor chaining 
	ThisWithConstructor() {	
	System.out.println("I am inside of a constructor with no parameters");	
	System.out.println("I have no parameters");	
	}
	
	ThisWithConstructor(String str) {
		this();
		System.out.println("I am inside of a constructor with 1 parameter");	

		System.out.println("I have 1 String parameter "+str);	
		}
		

	ThisWithConstructor(String str1, String str2) {
		this(str1);
		System.out.println("I am inside of a constructor with 2 parameters");	
		System.out.println("I have 2 String parameters "+str1+" "+str2);	
		}
	
	public static void main(String [] args) {
		
//		ThisWithConstructor obj1 = new ThisWithConstructor();
//		ThisWithConstructor obj2 = new ThisWithConstructor("Hello");
		ThisWithConstructor obj3 = new ThisWithConstructor("Hello", "Bye");


		
		
	}
	
	
	
}
