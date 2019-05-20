package com.class26;

public class ConstructorOverloading {
	
	
//	Create a class in which you will have overloaded constructors. 
//	Create and instance of the class that will execute both constructors.
	
	
	
	ConstructorOverloading(String name, int age) {
		System.out.println("The name is "+name+" and the age is "+age);
	}
	
	ConstructorOverloading(String name, String lastName, int age) {
		this(name, age);
		System.out.println("The name is "+name+" the last name is "+lastName+" and the age is "+age);
	}
	
	

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading("Mary", "Snow", 5);	

	}

}
