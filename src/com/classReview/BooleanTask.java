package com.classReview;

public class BooleanTask {

//  (true,true) print false
//  (false,true) print true
//  (true,false) print false
//  (false,false) print true

	static boolean print(boolean a, boolean b){
		boolean c=false;
		if (a==true && b==true) {
			c=false;	
		}if (a==false && b==true) {
			c=true;	
		}if (a==true && b==false) {
			c=false;	
		}if (a==false && b==false) {
			c=true;	
		}
		return c; 
	}
	
	
	public static void main(String[] args) {
			
		System.out.println(print(true, true));
		System.out.println(print(false, true));
		System.out.println(print(true, false));
		System.out.println(print(false, false));

	}

}
