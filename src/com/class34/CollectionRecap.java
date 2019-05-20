package com.class34;

import java.util.*;

public class CollectionRecap {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		set.add("java");
		set.add("is");
		set.add("fun");
		set.add("and");
		set.add("logic based");
		
		System.out.println(set);
		System.out.println();
		
		Map<Integer, String> map = new Hashtable<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, null);
		map.put(4, "D");
		map.put(5, "null");
		
		System.out.println(map);
		
		
	}

}
