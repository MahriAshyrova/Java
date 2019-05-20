package com.class29;

public class Square implements Shape {

	@Override
	public void calculateArea(double r) {
		
		System.out.println("The area of a squarer is "+r*r);
	}

	@Override
	public void calculatePerimiter(double r) {
		
		System.out.println("The are of asquare is "+4*r);
	}

}
