package com.class33;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

	public static void main(String[] args) {
		
		//Set<String> classDays=new HashSet<>(); - no duplicates, no order
		//Set<String> classDays=new LinkedHashSet<>(); - no duplicates, maintains the ORDER
		Set<String> classDays=new TreeSet<>(); // no duplicates, prints based on values (0-9) (A-Z)
		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		
		// no order, no index 
		
		System.out.println("-----------------------------");

		for (String days:classDays) {
			System.out.println(days);
		}
		System.out.println("-----------------------------");
		
		Iterator<String> it = classDays.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
