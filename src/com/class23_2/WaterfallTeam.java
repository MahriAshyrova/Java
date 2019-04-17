package com.class23_2;

import com.class23.Employee;

public class WaterfallTeam extends Employee {
	
	public static void main (String [] args) {
	
	WaterfallTeam wt = new WaterfallTeam();
	wt.salary1=90000; // can access protected values from different package through inheritance  ONLY
	// wt.salary; - default values cannot be accessed in different package  
	
	wt.test(); // available bacause it is protected 
	// wt.test1();  not available bacause it is default 
	
	
	
	}
	
	

}
