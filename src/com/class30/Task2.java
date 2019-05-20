package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		
//		2.Create an arrayList of words. Remove every word that ends with “e”.

		ArrayList<String> al=new ArrayList<>();
		al.add("late");
		al.add("make");
		al.add("fake");
		al.add("hello");
		
		
		for (int i=0; i<al.size(); i++) {
			al.get(i);
		}
		
		Iterator<String> it= al.iterator();
		
		while (it.hasNext()) {
			String words=it.next();
			if(words.endsWith("e")) {
				it.remove();
			}
		}
		
		System.out.println(al);
		
		
	}

}
