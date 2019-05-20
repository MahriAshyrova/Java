package com.class34;

import java.util.*;

public class MapTask {

	public static void main(String[] args) {
		/**
	        * Store the following key value pairs in a Map and
	        *
	        * (Sun,1), (Tue, 2), (Wed, 3), (Thu, 4), (Fri,5), (Sun,7)
	        *
	        * Write program to test if the map contains a mapping for the specified key(6).
	        *
	        *
	        */
		
	
		Map <String, Integer> map=new HashMap<>();
		map.put("Sunday", 1);
		map.put("Monday", 2);
		map.put("Tuesday", 3);
		map.put("Wednesday", 4);
		map.put("Thursday", 5);
		map.put("Saturday", 7);
		
		if(map.containsKey("Friday")) {
			System.out.println(map);	
		}else {
			System.out.println("The map doesn't contain the specified key");
		}
		
		System.out.println("------------------");
		
		 Map<String, Integer> map1 = new HashMap<String, Integer>();
	        map1.put("Mon", 1);
	        map1.put("Tue", 2);
	        map1.put("Wed", 3);
	        map1.put("Thu", 4);
	        map1.put("Fri", 5);
	        map1.put("Sun", 7);

	        // print the map
	        System.out.println("The Original map: " + map1);
	        System.out.println("\n key 'Sat' exist?");
	        if (map1.containsKey("Sat")) {
	            // key exists
	            System.out.println("yes! - " + map1.get("Sat"));
	        } else {
	            // key does not exists
	            System.out.println("no!");
	        }

	        System.out.println("\n key 'Tue' exists?\n");
	        if (map1.containsKey("Tue")) {
	            System.out.println("yes!\n");
	        } else {
	            System.out.println("\n no!");
		
		
		
	        }	
		
	}

}
