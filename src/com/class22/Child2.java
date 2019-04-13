package com.class22;

public class Child2 extends Parent{

	
	
	public static void main(String[] args) {
		
		Child2 childObject =new Child2();
		System.out.println("Child 2 has "+childObject.eyeColor+" eye color");
		System.out.println("Child 2 has "+childObject.hairColor+" hair color");
		System.out.println("Child 2 has a "+childObject.nose+" nose");
		childObject.sing();
		childObject.swim();
		

	}

	
	public void sing() {
		System.out.println("Child 2 can sing");
	}
	
	
	public void swim() {
		System.out.println("Child 2 can swim");
	}
	
	
	
	
}
