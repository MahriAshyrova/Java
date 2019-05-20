package com.class33;

import java.util.HashMap;
import java.util.Map;

//Create a map of a building. Store floor number and it is associated company name. 
//(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
//Check how many entries you have?
//Update company on a 4th floor
//Remove company on the 7th floor
//Print your map


public class MapTask1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(3, "Apple");
		map.put(4, "Google");
		map.put(1, "Apple");
		map.put(2, "Syntax");
		map.put(3, "Apple");
		
		System.out.println(map);
		
		System.out.println("------------------");
		
		System.out.println(map.size());
		
		System.out.println("------------------");
		
		map.replace(4, "Microsoft");
		System.out.println(map);
		
		System.out.println("------------------");
		
		map.remove(1);
		System.out.println(map);
		
		System.out.println("------------------");
		
		map.remove(2, "Syntax");
		System.out.println(map);
		
		
	}
}
