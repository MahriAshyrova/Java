package com.ReviewSession;


/*I want you to create two classes one called MainInherintence and ChildInherintence
*
* in your main class i want you to create 1 method to swap numbers, and another to swap strings
*
* and in your child i want you to extend main, and i want you to create the same methods, and paramters, but in the block of code
* i want you to print "not reversing" for swap numbers, and print 2 "not reversing" swap String
*/
public class MainInheritance {
	
	void swapNumbers(int a, int b) {
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a+" "+b);
	
	}
	void swapStrings(String s1, String s2) {
		
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println(s1+" "+s2);
		
		}
}
class ChildInheritance extends MainInheritance{
	
	void swapNumbers(int a, int b) {
		
		System.out.println(a);
        System.out.println(b);
	}
	
	void swapStrings(String s1, String s2) {
		System.out.println(s1+" "+s2);
	}
	
	
	void parentNumbers(int a, int b) {
		super.swapNumbers(a, b);
		
	}
	
	void parentStrings(String s1, String s2) {
		super.swapStrings(s1, s2);
		
	}
	
	
	
	}
	
	

