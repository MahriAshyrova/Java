package com.class32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Task1 {
//	1. Create an ArrayList of Strings and using Collections class sort the values of that ArrayList.
	    
	public static void main(String[] args) {
		
		ArrayList<String> alist= new ArrayList();
		alist.add("Hello");
		alist.add("Bye");
		alist.add("World");
		alist.add("Sunshine");
		System.out.println("Collection before sorting "+alist);
		Collections.sort(alist);
		System.out.println("Collection after sorting "+alist);
		System.out.println("---------------------------------------");
		
//		2. Create an array of Strings and using Arrays class  class sort the values of that array of Strings.	
		
		String[] al= {"Flowers", "Blossom", "In", "Spring"};
		
		Arrays.sort(al);
		System.out.println("String Array after sorting");
		for (String sort:al) {
			System.out.println(sort+" ");
		}
		System.out.println();
//		3. Create an HashSet of cities and add duplicates into it.
//		    Retrieve all values from hashset in 2 different ways.
//		    Retrieve all values in alphabetical order.
		
		HashSet<String> hset= new HashSet();
		hset.add("Fairfax");
		hset.add("Herndon");
		hset.add("Reston");
		hset.add("Chantilly");
		hset.add("Cliffton");

		System.out.println(hset);
		hset.add("Fairfax");
		hset.add("Herndon");
		hset.add("Reston");
		System.out.println(hset);
		
		
		System.out.println("------------------");
		for (String cities:hset) {
			System.out.print(cities+" ");
		}
		System.out.println();
		
		Iterator<String> iterator=hset.iterator();
		while(iterator.hasNext()) {
			String words=iterator.next();
			System.out.print(words+" ");
		}
		System.out.println();
		
		// Sorting HashSet using List 
		List<String> list = new ArrayList<String>(hset); 
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println();
		
		for (String city:list) {
			System.out.print(city+" ");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
