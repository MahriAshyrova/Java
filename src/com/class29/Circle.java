package com.class29;

public class Circle implements Shape {

	@Override
	public void calculateArea(double r) {
		
		System.out.println("The area of a circle is "+3.14*r*r);	
	}

	@Override
	public void calculatePerimiter(double r) {
		
	System.out.println("The area of a circle is "+2*r*3.14);	
	}
}
