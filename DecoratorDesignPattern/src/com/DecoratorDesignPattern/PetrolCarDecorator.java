package com.DecoratorDesignPattern;

public class PetrolCarDecorator extends CarDecorator{
	public PetrolCarDecorator(Car car) {
		super(car);
	}
	public Car manufactureCar(Car car) {
		car.manufactureCar();
		addEngine(car);
		return car;
	}
	public void addEngine(Car car) {
		if(car instanceof LuxuryCar) {
			LuxuryCar luxuryCar = (LuxuryCar) car;
			luxuryCar.setEngine("Petrol Engine");
			System.out.println("PetrolCarDecorator added : "+car);
		}
	}
}
