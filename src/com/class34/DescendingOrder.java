package com.class34;

import java.util.*;

public class DescendingOrder {
	
	/**
     * Write a program to
     *
     * Print in ascending order print an element in a tree set which is greater than
     * the given element 25 in ascending order.
     *
     * Print all elements in descending order
     *
 */

	public static void main(String[] args) {
		
		TreeSet <Integer> treeNum=new TreeSet<>(); 
		treeNum.add(25);
		treeNum.add(45);
		treeNum.add(55);
		treeNum.add(65);
		
		System.out.println("The ascending order of the elements: "+treeNum+"\n");
		
		for(Integer tNum:treeNum) {
			if(tNum>=25) {
			System.out.print(tNum+" ");
		}
		}
		
		System.out.println("\n"+"\n"+"The descending order of the elements :"+treeNum.descendingSet());
		
		
		
	}

}
