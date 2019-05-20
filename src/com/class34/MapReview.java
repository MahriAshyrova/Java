package com.class34;

import java.util.*;
//create a map of grocory products and its quantity 
public class MapReview {
	public static void main(String[] args) {
		
	Map<String, Integer> groceryMap= new LinkedHashMap<>();
	groceryMap.put("Milk", 1);
	groceryMap.put("Bread", 2);
	groceryMap.put("Eggs", 12);
	groceryMap.put("Coffee", 2);
	groceryMap.put("Potato", 2);
	groceryMap.put("Cookies", 3);
	System.out.println(groceryMap);
	groceryMap.put("Cheese", 1);

	System.out.println(groceryMap.size());
	System.out.println(groceryMap);

	groceryMap.replace("Eggs", 18);
	System.out.println(groceryMap);	
	
	groceryMap.remove("Cheese");	
	System.out.println(groceryMap);
	
	// retrieving all key+values using keySet()
	
	Set<String> keySet=groceryMap.keySet();
	
	for(String key:keySet) {
		System.out.println("Key is "+key+" and the values are "+groceryMap.get(key));
	}	
System.out.println();
	Iterator<String> keyIt=keySet.iterator();
	while(keyIt.hasNext()) {
		String key=keyIt.next();
		System.out.println(key+": "+groceryMap.get(key));
	}
	System.out.println();
	for( String key:groceryMap.keySet()) {
		System.out.println("Key is "+key+" and the values are "+groceryMap.get(key));
	}
	
	System.out.println();
	Iterator<String> keyIt1=groceryMap.keySet().iterator();
	while(keyIt1.hasNext()) {
		String key=keyIt1.next();
		System.out.println(key+": "+groceryMap.get(key));
	}
	
	System.out.println();
	// retrieving all values using:
	
	Collection<Integer> valCollection=groceryMap.values();
	
	for(Integer value: valCollection) {
		System.out.println(value);
	}
	System.out.println();
	for(Integer value:groceryMap.values()) {
		System.out.println(value);
	}
	
	Iterator<Integer>valueIt=groceryMap.values().iterator();
	
	while(valueIt.hasNext()) {
		System.out.println(valueIt.next());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
