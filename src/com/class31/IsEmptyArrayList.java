package com.class31;

import java.util.ArrayList;

public class IsEmptyArrayList {
	
	
//	isEmpty(); method of ArrayList is used to check whether the given ArrayList is empty or not. This method returns true
//	 if an ArrayList contains no elements otherwise returns false.
//	Without adding the numbers to the list call isEmpty method
//	after adding the one or two numbers to the list call isEmpty Method


	public static void main(String[] args) {
	    
		   
	       ArrayList<String> list = new ArrayList<String>();
	       System.out.println(list.isEmpty());  
	        list.add("JAVA");
	        System.out.println(list.isEmpty()); 
	  }
	
	
}
