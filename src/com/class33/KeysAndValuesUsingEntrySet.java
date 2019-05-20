package com.class33;

import java.util.*;

public class KeysAndValuesUsingEntrySet {

	public static void main(String[] args) {
		
		// create a map to store the user details (name, salary, department, title)
		
		Map<String, String> userDeatilsMap= new LinkedHashMap<>();// TreeMap<>();
		userDeatilsMap.put("Name", "Alex Smith"); // 1 entry = Key=Name+values="Alex Smith"
		userDeatilsMap.put("Salary", "90000"); // 2 entry
		userDeatilsMap.put("Department", "IT"); // 3 entry
		userDeatilsMap.put("Title", "Automation Tester");
		
		System.out.println(userDeatilsMap);
		
		System.out.println();
		
		userDeatilsMap.entrySet(); // return a set of entries
		
		for(Map.Entry<String, String> entry: userDeatilsMap.entrySet() ) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println("-------------------Using iterator");
		Iterator <Map.Entry<String, String>> it=userDeatilsMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry=it.next();
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		
	}

}
