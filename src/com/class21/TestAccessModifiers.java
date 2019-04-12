package com.class21;

import com.class20.Task3;

public class TestAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Task3 obj=new Task3(); 
		
		obj.isPalindrome("civic"); // accessing public from a different package
		System.out.println(obj.name3); // accessing public variable in a different package
		
		
		
		
		
	}

}
