package com.FactoryMethodPattern;

public class DieselPrice extends PetrolBunk{
	@Override
	public void getPricePerLitre() {
		pricePerLitre = 98.23;
	}
}
