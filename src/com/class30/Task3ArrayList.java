package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3ArrayList {

	public static void main(String[] args) {
		
		// 3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
		
		
	ArrayList<String> alist= new ArrayList<>();
	alist.add("soda");
	alist.add("cola");
	alist.add("pepsi");
	alist.add("composto");
	
		
	for (int i=0; i<alist.size(); i++) {
		alist.get(i);
		String drinks=alist.get(i);
		if(drinks.contains("a") || drinks.contains("e")) {	
			drinks=alist.set(i, "water");	
	}
	}
	
	System.out.println(alist);
	

	
	
		

	}

}
