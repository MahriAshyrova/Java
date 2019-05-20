package com.class30;

import java.util.ArrayList;

//Create an ArrayList and modify it by removing every other element in the list, starting with removing the 0th element.
//
//Add these values below to your arraylist
//("hi" "yo" "sup" "yolo" "boop")
//use an advanced for loop to print the new values to the array list
//yo yolo 

public class RemoveAnyOtherStringElement {

	public static void main(String[] args) {
		
		
		ArrayList<String> arrlist=new ArrayList<String>();
		
		arrlist.add("hi");
		arrlist.add("yo");
		arrlist.add("sup");
		arrlist.add("yolo");
		arrlist.add("boop");
		
		for(int i=0;i<arrlist.size();i++) {
			arrlist.remove(i);
		}
		
		for (Object object : arrlist) {
			System.out.print(object+" ");
		}
	}

}
