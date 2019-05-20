package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromArrayList {

//	How can you remove all duplicates from ArrayList?
//
//			List<String> aList=new ArrayList<String>();
//			        aList.add(“John”);
//			        aList.add(“Jane”);
//			        aList.add(“James”);
//			        aList.add(“Jasmine”);
//			        aList.add(“Jane”);
//			        aList.add(“James”);
	
	public static void main(String[] args) {
		
		List<String> aList=new ArrayList<String>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        // no duplicates, no order
        Set<String> aList1=new HashSet<>();
        aList1.addAll(aList);
        System.out.println(aList1);
		
        // no duplicates, maintains the ORDER
        Set<String> aList2=new LinkedHashSet<>();
        aList2.addAll(aList);
        System.out.println(aList2);
		
        // no duplicates, prints based on values (0-9) (A-Z) 
        Set<String> aList3=new TreeSet<>();
        aList3.addAll(aList);
        System.out.println(aList3);
		
		
		
		
		

	}

}
