package com.class34;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class MarketingTest {

	public static void main(String[] args) {
		
		
		Map<Integer, Marketing> mapObj1=new LinkedHashMap<>();
		mapObj1.put(1, new Marketing("John", "TV", 3000));
		mapObj1.put(2, new Marketing("Jack", "Computer", 4000));
		mapObj1.put(3, new Marketing("Josh", "Phone", 6000));
		mapObj1.put(4, new Marketing("James", "TV", 5000));
		mapObj1.put(5, new Marketing("Jake", "TV", 3500));
		mapObj1.put(6, new Marketing("Mary", "Food Processor", 100));
		mapObj1.put(7, new Marketing("Marina", "Cooking pot", 1005));
		mapObj1.put(8, new Marketing("Mark", "Scooter", 5500));
		mapObj1.put(9, new Marketing("Jacky", "TV", 4005));
		mapObj1.put(10, new Marketing("Lary", "TV", 2000));
		
		
		Collection<Marketing> personDetails=mapObj1.values();
		for(Marketing person:personDetails) {
			if(person.getSaleAmount()>3000) {
			System.out.println("Employee name is "+person.getEmployeeName()
			+", the product name is "+person.getProductName()+", the sales amount is "+person.getSaleAmount());
			}
		}
		
//		Map<String, Marketing> sales = new HashMap<String, Marketing>();
//
//        sales.put(“Joe”, new Marketing(“Joe”, “Shoes”, 2000.00));
//        sales.put(“Smith”, new Marketing(“Smith”, “Shoes”, 4000.00));
//        sales.put(“Adam”, new Marketing(“Adam”, “Shoes”, 6000.00));
//        sales.put(“Tiffany”, new Marketing(“Tiffany”, “Shoes”, 7000.00));
//        sales.put(“Aloha”, new Marketing(“Aloha”, “Shoes”, 1000.00));
//        sales.put(“Sam”, new Marketing(“Sam”, “Shoes”, 10000.00));
//        sales.put(“Mustafa”, new Marketing(“Mustafa”, “Shoes”, 50000.00));
//        sales.put(“Kelda”, new Marketing(“Kelda”, “Shoes”, 3000.00));
//
//        for (String key : sales.keySet()) {
//
//            Marketing m = sales.get(key);
//
//            if (m.getSaleAmount() > 3000)
//                System.out.println(m.toString());
//        }
//		
		
	}

}
