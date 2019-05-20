package com.classReview;

public class Child2 extends Parent1{
	
	Child2(){
		System.out.println("I am from a child class");
	}
	
	

	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		System.out.println(obj.reverse("flower"));
		System.out.println(obj.reverse("one", "two"));
		
		

	}

}
