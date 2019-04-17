package com.class24;

public class TestParent {

	public static void main(String[] args) {
		

		String a;
		a="10";
		
		Parent parent=new Parent(); 
		parent.love();
		parent.work();
		
		
		Child child= new Child();
		child.love();
		child.cry();
		child.work();
		
		
		// type casting 
		//Child obj1= new Parent(); - not possible 
		// achieveing run time polymorphism 
		
		Parent obj=new Child();
		obj.work(); // parents work 
		obj.love(); // child love  - common method 
		// obj.cry();  not accessible 
		
	}

}
