package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {

		
	ArrayList <Integer>	numbers=new ArrayList<Integer>();
		
	numbers.add(12); // comes from collection 
	numbers.add(0, 13); // specific to all List objects 
	numbers.add(0, 14); // this will shift 13 and replace it with 14

	
	System.out.println(numbers.size());
	System.out.println(numbers.get(2));
	
	numbers.set(1, 33); // replace a number at the sceficied index
	System.out.println(numbers.get(1));
	
	numbers.contains(33);
	System.out.println(numbers.contains(33));
	
	System.out.println("-------1 way using for loop ------"); 
	
	// 1. regular for loop
	for (int i=0; i<numbers.size(); i++) {
		System.out.println(numbers.get(i));
	}
	System.out.println("-------2 way using advanced for loop ------"); 
	// 2. using for each loop 
	for (int num:numbers) {
		System.out.println(num);
	}
	System.out.println("-------3 way using iterator ------"); 
	
	// 3. using Advanced Iterator 
	// hasNext(); next(); remove();
	
	Iterator <Integer> it= numbers.iterator(); 
	while(it.hasNext()) {
		int number=it.next();
		System.out.println(number);
	}
	
	System.out.println("-------4 way using while loop ------"); 
	
	// 4. using while loop
	int c=0;
	while (numbers.size()>c) {
		int myNum=numbers.get(c);
		System.out.println(myNum);
		c++;
	}
	
	
	
	
	
	
	
	
	
	}

}
