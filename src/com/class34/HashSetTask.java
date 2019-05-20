package com.class34;

import java.util.*;

public class HashSetTask {
	
	 /**
     * Store and Print the following elements using a HashSet "Red" "Green" "Black"
     * "White" "Pink" "Yellow"
     */

	public static void main(String[] args) {
		
	
	HashSet<String> colors=new HashSet<>();
	colors.add("Red");
	colors.add("Green");
	colors.add("Black");
	colors.add("White");
	colors.add("Pink");
	colors.add("Yellow");
		
		
	Iterator<String> iterator=colors.iterator();
	System.out.println("HashSet elements are: ");
	while(iterator.hasNext()) {
		String col=iterator.next();
		System.out.print(col+" ");
	}
	System.out.println();
	System.out.println();
	/**
	*          * ReStore and Print the above hashSet in a TreeSet
	*
	*/
	 
	
	Set<String> color=new TreeSet<>(colors);
	
	System.out.println("Tree elements are:");
	for(String clr:color) {
		System.out.println(clr+" ");
	}
	
	
	
		

	}

}
