package com.class30;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList <String>  greetings = new ArrayList<String>();
		greetings.add("hello");
		greetings.add("welcome");
		greetings.add("hi");
		greetings.add("bye");
		
		
		System.out.println(greetings); // [hello, welcome, hi, bye]
		System.out.println();
		
		
		System.out.println(greetings.get(1));
		System.out.println(greetings.size()); // 4

		// collections - growable in size 
		greetings.add("How are you?");
		greetings.add("How are you?");
		greetings.add("How are you?");
		
		System.out.println(greetings.size()); // 7
		
		System.out.println("---------for loop-----------");
		
		for (int i=0; i<greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		
		System.out.println("---------advanced for loop-----------");

		for (String greetWords:greetings) {
			System.out.println(greetWords);
		}
	}
}
