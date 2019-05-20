package com.class31;

import java.util.ArrayList;

public class OwnMethodArrayList {
	
	public static ArrayList<String> test()
	{
		ArrayList<String> names = new ArrayList<String>();

		names.add("Shiva");
		names.add("Sandish");
		names.add("Asel");

		return names;
	}
	public static void main(String[] args){

   ArrayList<String> arr= test();
   System.out.println(arr);
   
 }
	

}
