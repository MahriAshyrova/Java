package com.class21;

public class InstanceVariables {
	
	protected String name="John"; // instance variables can have access modifiers 

	public static void main(String[] args) {
		
	String name="Anna";	
	System.out.println(name);	
	System.out.println("----Changing the value of a local variable-----------");
	name="Olga";
	System.out.println(name);	
	
	//creating 1 object
	InstanceVariables obj = new InstanceVariables();
	System.out.println(obj.name);
	System.out.println("----Changing the value of an instance variable-----------");

	obj.name="Jack";
	System.out.println(obj.name);
	
	 //creating 2 object
	InstanceVariables obj1 = new InstanceVariables();
	System.out.println(obj1.name);
	
		
	}
	
	public void hello(String name) {
		System.out.println("Hello "+name);
	}

}
