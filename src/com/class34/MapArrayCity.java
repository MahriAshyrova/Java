package com.class34;

import java.util.*;
//Create a Map from array of cities that will sort keys in alphabetical order. 
//As a key store the name of the city and as a value store the length of the city name (Example: Paris=5, Moscow =6 etc..).
//If any city name is more than 7 characters remove that city ( use entrySet with Iterator ).

public class MapArrayCity {

	public static void main(String[] args) {
		
	String[] cities= {"Paris", "Moscow", "London", "Istanbul", "Ashgabat"}; 		
		
	Map<String, Integer> map=new TreeMap<>();
	
	
	for(String city:cities) {
		map.put(city, city.length());
	}
		
	System.out.println(map);
	System.out.println();
	
	Iterator<Map.Entry<String, Integer>> iterator=map.entrySet().iterator();
	while(iterator.hasNext()) {
		Map.Entry <String, Integer>cityNames=iterator.next();
		if(cityNames.getValue()>7) {
			iterator.remove();
			
//			String key=iterator.next().getKey();
//			if(key.length()>7) {
//				iterator.remove();
//			}
//			
			
			
		}	
	}	
		
	System.out.println(map);	
		
		
		
	}

}
