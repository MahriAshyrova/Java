package com.ReviewSession;

public class Hello {
	
	/*Create a class called Hello
    * create 1 constructor with one parameter
    * create 1 constructor with two parameters
    * create 1 constructor with three parameters
    *
    * i want you to use "this" key word and access those constructors pass values for each
    * but have one print statement for each constructor with one variable. make sure you use same
    * data type
    */
	
	Hello(String a){
		System.out.println("I am a constructor with 1 parameter");
	}
	
	Hello(String a, String b){
		this("Hello");
		System.out.println("I am a constructor with 2 parameters");
	
	}
	
	Hello(String a, String b, String c){
		this("Hello", "Bye");
		System.out.println("I am a constructor with 3 parameters");

}

	public static void main(String [] args) {
		
		Hello obj=new Hello("How", "are", "you");
	}
	
	

}
