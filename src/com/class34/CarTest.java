package com.class34;
import java.util.*;
public class CarTest {
	public static void main(String[] args) {
		
		// create a map in which we will store the carNumber and Car itself
		Car car1= new Car("Toyota", "Corolla");
		Car car2= new Car("Honda", "Accord");
		Car car3= new Car("Lada", "Priora");
		car1.printCarDetails();
		car2.printCarDetails();
		car3.printCarDetails();
		
		System.out.println();
		
		Map<Integer, Car> carMap= new HashMap<>();
		carMap.put(1, new Car("BMW", "x8"));
		carMap.put(2, new Car("Audi", "R8"));
		carMap.put(3, new Car("Mercedes", "Cls"));
		
		Collection<Car>carValues= carMap.values();
		
		for(Car car:carValues) {
			car.printCarDetails();
		}
		
		
		
		
		
		
	}

}
