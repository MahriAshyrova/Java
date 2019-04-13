package com.class22;

public class Car {
	
	public static String make="Toyota";
	String color;  // declaring an instance variable 
	String model;
	int doors;
	boolean engine;
	
	
	Car() { // constructor, accepts access modifiers 
		System.out.println("I am a constructor");
		System.out.println("Hello from a constructor");
	}

	public static void main(String[] args) {
		
		Car obj = new Car();
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		hello(); 
		
		
	}
	public static void hello() {
		// before using the local variable we have to initialize it 
		String name;
		// System.out.println(name); - compilier will give you an error
		System.out.println("I am a static hello method");
	}

}
