package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetAllValuesFromArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> names= new ArrayList <String>();
		
		names.add("Mary");
		names.add("Kary");
		names.add("Lary");
		names.add("Sary");
		names.add("Fary");
		
		System.out.println("-------1 way using for loop ------"); 
		
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("-------2 way using advanced for loop ------"); 
		for (Object name: names) {
			System.out.println(name);
		}
	
		System.out.println("-------3 way using iterator ------"); 
		
		Iterator <String > it = names.iterator();
		// boolean check=it.hasNext();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}	
	}
}
