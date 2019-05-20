package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1ArrayList {

	public static void main(String[] args) {
		
//		1.Create an arraylist of cars and retrieve all the values using 4 different ways.
//
//		2.Create an arrayList of words. Remove every word that ends with “e”.
//
//		3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
//
//		4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.	
//		

	ArrayList<String> al=new ArrayList<>();	
	al.add("BMV");
	al.add("Toyota");
	
	for (int i=0; i<al.size(); i++) {
		System.out.println(al.get(i));
	}
	
	for(String arl:al){
		System.out.println(arl);
	}	
	
	Iterator<String> it=al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	int a=0;
	while(al.size()>a) {
		System.out.println(al.get(a));
		a++;
	}
		
		
		

	}

}
