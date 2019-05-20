package com.class32;

public abstract class Insurance {
//	Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. 
//	Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
//	Create 3 objects of the sub classes and store them in ArrayList. Using 1 reference variable access methods from different classes.
//	
	public String insuranceName;
	
	public Insurance  (String insuranceName) {
		this.insuranceName=insuranceName;
	}
	
	public abstract void getQuote();
	public abstract void cancelInsurance();

}
class Car extends Insurance{
	
	public String carModel;
	
	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}

	@Override
	public void getQuote() {
		System.out.println("Get a quote for a car Insurance "+insuranceName+" for a  car model "+carModel);		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel a car Insurance "+insuranceName+" for a  car model "+carModel);		
	}	
}
class Pet extends Insurance{
	
	public String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}

	@Override
	public void getQuote() {
		System.out.println("Get a quote for a pet Insurance "+insuranceName+" for a type "+petType);		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel a pet Insurance "+insuranceName+" for a type "+petType);			
	}
	
}
class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Get a quote for a health Insurance");		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("Cancel a health Insurance");		
	}
	
}

