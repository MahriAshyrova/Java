package com.class15;

public class Dog {
	
	
	String breed, color;
	int age;
	
	

	public static void main(String[] args) {
		// Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviours.
		
		
		Dog dog1=new Dog();
		
		dog1.breed="Husky";
		dog1.color="White";
		dog1.age=3;
		
		dog1.bark();
		dog1.age();
		dog1.eat();
		
		
		Dog dog2=new Dog();
		
		dog2.breed="Bulldog";
		dog2.color="Grey";
		dog2.age=5;
		
		dog2.bark();
		dog2.age();
		dog2.eat();
		
		
		Dog dog3=new Dog();
		
		dog3.breed="Labrador";
		dog3.color="Black";
		dog3.age=6;
		
		dog3.bark();
		dog3.age();
		dog3.eat();
		
	}
	
	void bark() {
		System.out.println("The dogs bark");
	}
	void age() {
		System.out.println("The dogs age");
	}
	void eat() {
		System.out.println("Dogs eat");
	}
	
	

}
