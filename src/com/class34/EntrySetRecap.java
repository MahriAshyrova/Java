package com.class34;
import java.util.*;
public class EntrySetRecap {
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
		System.out.println();
		
		//retrieveing all keys+values using entryset();
		//Set<Map.Entry<String, Integer>> setOfEntries=groceryMap.entrySet();

		for(Map.Entry<String, Integer> entry:groceryMap.entrySet()) {
			
			String mapValue=entry.getKey()+"=="+entry.getValue();
			System.out.println(mapValue);
		}
		System.out.println();
		//map--->using entrySet we will get Set--> any collection has an iterator method--->returns one iterator object
		Iterator<Map.Entry<String, Integer>>it=groceryMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry=it.next();
			String valueFromMap=entry.getKey()+" and value is "+entry.getValue();
			System.out.println(valueFromMap);
		}
		
	}
}
