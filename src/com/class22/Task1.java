package com.class22;

public class Task1 {
	
	// Write a program that will have a constructor: one with parameters and second without any parameters. 
	// Create a separate Test class where you will execute both of the constructors.
	
	public String name="Mike";
	
	public Task1() {
		System.out.println("I am a constructor with no parameters");
	}
	
	public Task1(String name) {
		name=name;
		System.out.println("My name is "+name);
	}
	
	
	public void printConstructor() {
		System.out.println("My name is "+name);
		
	}
	
	
	
	
	

}
