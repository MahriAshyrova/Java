package com.class21;

public class Dog {

	static String breed ="Husky";
	static int paws =4;
	
	String name;
	int weight;
	int height;
	
	
	public static void main(String[] args) {
		
		Dog dog1= new Dog();
		Dog dog2= new Dog();
		Dog dog3= new Dog();
		//dog 1
		dog1.name="Mardy";
		dog1.weight=60;
		dog1.height=40;
		dog1.getDogProporties();
		// dog 2
		dog2.name="Waffle";
		dog2.weight=100;
		dog2.height=90;
		dog2.getDogProporties();
		
		breed="Pug";
		
		// dog 3 
		dog3.name="Lucy";
		dog3.weight=20;
		dog3.height=30;
		dog3.getDogProporties();
		
		
		dog1.getDogProporties();
		dog2.getDogProporties();
		System.out.println(breed);
		
		
		
		// 3 ways of accessing static variables 
	//	System.out.println(breed);
	//	System.out.println(Dog.breed); 	// by class name
	//	System.out.println(dog3.breed); // by object reference - not prefered

		

	}
	
	public void getDogProporties() {
		System.out.println(name+" is a breed of "+breed+" and weight is "+weight+" and the height is "+height);
	}

}
