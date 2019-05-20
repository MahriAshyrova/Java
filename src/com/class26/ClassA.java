package com.class26;

//2. Write program in class A has final display method and try overload and override this method and observe result .


public class ClassA {
	
	
	public final void display() {
		System.out.println("Final method");
	}
	
	public final String  display(String str) {
		System.out.println("Final method with a parameter");
		return str;
	}
	

}

//class ClassB extends ClassA{
//	
//	
//	// public final void display() {
//// 		System.out.println("Final method");
//	}
//	
//}
//







