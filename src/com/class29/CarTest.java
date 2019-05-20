package com.class29;

public class CarTest {
public static void main (String [] args) {
	Car car;
		
		Car car1 = new Sedan("blue", 2500, 3000);
		car1.calculateSalePrice();
		
		Car car2 = new Truck("black", 5500, 6000);
		car2.calculateSalePrice();
	}

}
