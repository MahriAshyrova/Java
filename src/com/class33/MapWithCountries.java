package com.class33;

import java.util.*;

public class MapWithCountries {
	
//	Create a map of countries with its capital. 
//	Print all keys and values from a country map using for each loop and iterator.
//	Print all values from a country map using for each loop and iterator.

	public static void main(String[] args) {
		
	Map<String, String> map=new HashMap<>();	
	map.put("Turkmenistan", "Ashgabat");	
	map.put("Turkey", "Ankara");
	map.put("Russia", "Moscow");	
	map.put("Spain", "Madrid");	
	
	Set<String>keys=map.keySet();
	for (String key:keys) {
		System.out.println(key+": "+map.get(key));
	}
	
	System.out.println();
	
	Iterator<String> it=keys.iterator();
	while (it.hasNext()) {
		String cities=it.next();
		System.out.println(cities+": "+map.get(cities));
	}
		
		
		
		
	}

}
