package com.class33;

import java.util.*;

public class BestBuy {

//	Create a map of Best Buy store. Place
//	item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//	Print all keys and values from a Best Buy map using EntrySet.
	
	public static void main(String[] args) {
		

		Map<Integer, String> storeMap= new LinkedHashMap<>();
		storeMap.put(7664847, "Printer");
		storeMap.put(7879885, "TV");
		storeMap.put(8879885, "Computer");
		
		
		for (Map.Entry<Integer, String> entry:storeMap.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println();
		
		Iterator<Map.Entry<Integer, String>> it=storeMap.entrySet().iterator();
		while(it.hasNext())  {
			Map.Entry<Integer, String>me=it.next();
			System.out.println(me.getKey()+": "+me.getValue());
		}
		
		
		
	}

}
