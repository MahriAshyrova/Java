package com.class26;

public class SuperWithConstructor {
	
	public SuperWithConstructor(){
		System.out.println("I am a parent class constructor");
	}
	
	public SuperWithConstructor(String str){
		System.out.println("I am a parent class constructor with 1 parameter");
	}
}

class ChildClassOfSuperWithConstructor extends SuperWithConstructor{
	
	public ChildClassOfSuperWithConstructor(){
		// super(); - compiler adds it by default 
		
		super("Hello");
		System.out.println("I am a child class constructor");
	}	
	
}

