package com.class28;

public interface TakesScreenShot {
	String fileExtension=".png"; // by default, it is public static final variable and it MUST be initialized 
	
	void takesScreenShot();
	
	// from Java 8, we can have defined methods in the interface: static or default 
	
	static void m1() {
		System.out.println("Static m1 method");
	}
	
	default void m2() {
		System.out.println("default m2 method");
	}

}
