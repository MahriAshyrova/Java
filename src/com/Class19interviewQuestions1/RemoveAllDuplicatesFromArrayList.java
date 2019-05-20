package com.Class19interviewQuestions1;

import java.util.*;

public class RemoveAllDuplicatesFromArrayList {

	public static void main(String[] args) {
		
		
		ArrayList aList=new ArrayList();
		
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine"); 
		aList.add("Jane");
		aList.add("James");

		// 1 way
		HashSet set=new HashSet(aList);
		System.out.println(set);
		
		
		// 2 way
		HashSet hset=new HashSet(); 
		for (Object name : aList) {
			hset.add(name); 
			}
		System.out.println(hset);
		
		
	}

}
