package com.class33;

import java.util.*;

public class AllKeysAndValuesFromMap {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "AA");
		map.put(3, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		System.out.println(map);
		
		// returns a set of keys from the map 
		Set<Integer>keys=map.keySet();
		
		// how to print ALL keys
		System.out.println("---------Using FOR EACH LOOP------");
		for( Integer key:keys) {
			System.out.println(key+": "+map.get(key));
		}
		
		System.out.println();
		
		System.out.println("---------Using iterator------");
		Iterator<Integer> keysIt= keys.iterator();
		while(keysIt.hasNext()) {
			Integer key=keysIt.next();
			System.out.println(key+": "+map.get(key));
		}

		// How to get ALL VALUE
		// returns collection of values of a map 
		Collection<String> valCol=map.values();
		
		System.out.println("---------Using FOR EACH LOOP------");
		for (String value: valCol) {
			System.out.print(value+", ");
		}
		
		System.out.println();
		System.out.println("---------Using iterator------");
		Iterator<String> itValues=valCol.iterator();
		while (itValues.hasNext()) {
			System.out.print(itValues.next() +", ");
		}
		
		
	}

}
