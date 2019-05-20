package com.class32;


import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.Set;

public class HashSetInfo {

	public static void main(String[] args) {
		
		HashSet<Integer>hset= new HashSet<>();
		hset.add(12);
		hset.add(32);
		hset.add(42);
		System.out.println(hset.size());
		// Set doesn't keep the order 
		System.out.println(hset);
		System.out.println(hset.contains(32));
		
		// Set Interface doesn't allow duplicates 
		hset.add(12);
		hset.add(32);

		System.out.println("------Using ADVANCED FOR LOOP-------");

		// 1. to retrieve all values from hashSet - ADVANCED FOR LOOP
		for (int num:hset) {
			System.out.println(num);
		}
		
		// Iterator 
		System.out.println("------Using an ITERATOR-------");
		Iterator<Integer> iterator=hset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		Set<String> hs = new LinkedHashSet<String>();
//		hs.add("first");
//		
//		Iterator<String> it=hs.iterator();
//	       while(it.hasNext()){
//	         String nums=it.next();
//	         System.out.println(nums);
//	         if(nums.contains("first"))
//	         System.out.println(nums);
//	       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
