package com.ReviewSession;

/* create a class called SuperKeyword
*
* create a base class with the name of MainSuper
*
* create 1 constructor with 1 parameter and print This is parent with 1 parameter
* create 1 constructor with 2 parameter and print This is parent with 2 parameter
*
* then create a child class called ChildSuper
*
* in child class create 1 constructor with 1 parameter and print this is from child with 1 paramater
* in child class create 1 constructor with 2 parameter and print this is from child with 2 paramater
* and in this i want you to find which super to use for the following
*
* i want you to create a main method in ChildSuper
* if i type in 2 parameters with calling the ChildSuper class in my main
* i want both
* constructor with 2 parameter from parent
* constructor with 2 parameter from child
* to appear
*
* same vice versa if you call the constructor from child with one parameter, i want the
* one parameter to appear from parent
*
* Hint, i should only see one instantiation of ChildSuper with 2 paramters
* And, i should only see one instantiation of ChildSuper with 1 parameter
*/


class MainSuper {
	
	int a=10;
	String str="Hello";
	boolean flag = true;
	
	
	MainSuper(String a){
	System.out.println("This is a parent with 1 parameter");		
	}
	
	MainSuper(String a, String b){
		System.out.println("This is a parent with 2 parameters");	
		}
	
}

public class ChildSuperrr extends MainSuper{
	
	int a=5;
	String str="Bye";
	boolean flag = false;
	
	void print() {
	System.out.println(super.a+" "+super.str+" "+super.flag);
	System.out.println(a+" "+str+" "+flag);

	}

	ChildSuperrr(String a) {
		super(a);
		System.out.println("This is a child with 1 parameter");
	}
	
	ChildSuperrr(String a, String b) {
		super(a, b);
		System.out.println("This is a child with 2 parameter");
	}
	

	public static void main(String[] args) {
		ChildSuperrr obj = new ChildSuperrr("hello", "bye");
		ChildSuperrr obj1 = new ChildSuperrr("yes");
		obj.print();
		

			
	}

}
