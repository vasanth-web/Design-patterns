package com.FactoryMethodPattern;

public abstract class PetrolBunk {
	
	protected double pricePerLitre;
	
	abstract void getPricePerLitre();
	
	public void calculateBill(int litres) {
		System.out.println(litres * pricePerLitre);	
	}

}
