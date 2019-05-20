package com.class31;

import java.util.ArrayList;

public class PrintDuplicateNumbers {
	
	public static void main(String[] args)
	{
	  ArrayList <Integer> list=new ArrayList<Integer>();
			for(int i=0;i<=5;i++) {
			list.add(i);
			list.add(i);
		}
		for (Object object : list) {
			System.out.print(object+", ");
		}
	}

}
