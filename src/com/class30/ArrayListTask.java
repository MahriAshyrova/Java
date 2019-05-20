package com.class30;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {
		
//		Create a generic ArrayList that will store 5 names into it.
//		Find out whether the given ArrayList is empty or not?
//		Check whether the specific name is present in an ArrayList or not?
//		Find the size of your arrayList and print all values from that
//		
		ArrayList <String> names= new ArrayList <String>();
		
		names.add("Mary");
		names.add("Kary");
		names.add("Lary");
		names.add("Sary");
		names.add("Fary");

		System.out.println(names.isEmpty());
		System.out.println(names.contains("Mary"));
		System.out.println(names.size());
		
		for (String name:names) {
			System.out.println(names);	
		}
		// non generic arrayList - we can store different types of Objects
		ArrayList alist=new ArrayList();
		alist.add("String");
		alist.add(100);
		alist.add(100.10);
		alist.add(true);
		alist.add('a');
		
		for (Object values:alist) {
			System.out.println(values);
		}
		
		ArrayList<Boolean> booleanArrayList = new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);

		for (Object val:booleanArrayList) {
			System.out.println(val);
		}
		
	}

}
