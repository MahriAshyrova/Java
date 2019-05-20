package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {

	public static void main(String[] args) {
		
//4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.	


		ArrayList<Integer> alist= new ArrayList<>();
		
		for (int i=1; i<=50; i++) {
			if(i%2==0) {
				alist.add(i);
			}
		}
		
		
	Iterator <Integer>it= alist.iterator();
		while(it.hasNext()) {
			int num=it.next();
			if(num%5==0) {
				it.remove();
			}
		}
		
		System.out.println(alist);
		
		
		
		
		
		
		
		
	}

}
