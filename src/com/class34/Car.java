package com.class34;

public class Car {
	
	public String carModel;
	public String make;
	
	Car(String make, String carModel){
		this.make=make;
		this.carModel=carModel;
		
	}
	
	public void printCarDetails() {
		System.out.println("Make is "+make+" and model is "+carModel);
	}

}
