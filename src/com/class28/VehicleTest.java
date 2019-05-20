package com.class28;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car car= new BMW("BMW");
		car.drive();
		car.start();
		car.stop();
		Vehicle.displayTotalVehicles();
		
		Car car1= new BMW("bmw");
		Car car2= new Toyota("sienna");
		Vehicle.displayTotalVehicles();
	}

}
