package com.class33;

import java.util.*;

public class EntrySet {

	public static void main(String[] args) {
		
		
		Map<String, Integer> classroomMap= new LinkedHashMap<>();
		classroomMap.put("Table", 20); // Entry<Key, Value>
		classroomMap.put("Chairs", 16); // Entry <String, Integer>
		classroomMap.put("Screens", 63);
		classroomMap.put("Students", 3);
		
		System.out.println(classroomMap);
		System.out.println();

		for(Map.Entry <String, Integer>entry:classroomMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println();
		
		Iterator<Map.Entry<String, Integer>> it=classroomMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> me=it.next();
			System.out.println(me.getKey()+": "+me.getValue());
		}
		
		
	}
}
