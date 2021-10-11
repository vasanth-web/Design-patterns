package com.FactoryMethodPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuelType fuel = new FuelType();
		
		PetrolBunk object1 = fuel.selectFuelType("Petrol");
		object1.getPricePerLitre();
		object1.calculateBill(10);
		
		PetrolBunk object2 = fuel.selectFuelType("Diesel");
		object2.getPricePerLitre();
		object2.calculateBill(10);
	}

}
