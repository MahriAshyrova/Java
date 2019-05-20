package com.class32;

import java.util.ArrayList;
import java.util.Iterator;
public class InsuranceTest {

	public static void main(String[] args) {
		Car car= new Car("Geigo", "BMW");
		Pet pet = new Pet("Sunshine", "Husky");
		Health health = new Health("Kaiser");
		
		ArrayList<Insurance> alist = new ArrayList();
		alist.add(car);
		alist.add(pet);
		alist.add(health);
		
		for (Insurance ins:alist) {
			System.out.println(ins.insuranceName);
			ins.getQuote();
			ins.cancelInsurance();
		}
		System.out.println("-----------------");
		
		for (int i=0; i<alist.size(); i++) {
			Insurance insurance=alist.get(i);
			insurance.getQuote();
			insurance.cancelInsurance();
		}
		System.out.println("-----------------");
		
		Iterator<Insurance> insrnc =alist.iterator();
		while (insrnc.hasNext()) {
			Insurance obj=insrnc.next();
			obj.getQuote();
			obj.cancelInsurance();
		}

	}

}
