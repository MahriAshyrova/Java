package com.class22;

public class StaticVsNonStatic {
	
	public String name="John"; // instance variable
	public static String lastName="Snow";  // static variable

	public static void main(String[] args) {
		
		StaticVsNonStatic obj =new StaticVsNonStatic();
		obj.getInfo();
		getInfo1(); // within the same class we can call it by using method/variable name 
		
		System.out.println(lastName);
		System.out.println(obj.name);
		
		
	}
	// non static method - non static method can access both instance and static variable 
	public void getInfo() {
		System.out.println("My name is "+name+" and my last name is "+lastName);
		// getInfo1(); - we can access static methods within non static 
	}
	// // static methods can ONLY have an access to static variables
	public static void getInfo1() {
		
		// System.out.println("My name is "+name+" and my last name is "+lastName);
		// will get an error 
		System.out.println("I am a static method");
		// getInfo() - we cannot access a non static methods within the static method 
	}
	
	

}
