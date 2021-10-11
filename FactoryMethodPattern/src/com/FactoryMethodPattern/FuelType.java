package com.FactoryMethodPattern;

public class FuelType {
	public PetrolBunk selectFuelType(String fuelType)
    {
        if (fuelType == null || fuelType.isEmpty())
            return null;
        if ("Petrol".equals(fuelType)) {
            return new PetrolPrice();
        }
        else if ("Diesel".equals(fuelType)) {
            return new DieselPrice();
        }
        return null;
    }
}
