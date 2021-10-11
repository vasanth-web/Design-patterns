package com.DecoratorDesignPattern;

public class DieselCarDecorator extends CarDecorator{
	public DieselCarDecorator(Car car) {
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
			luxuryCar.setEngine("Diesel Engine");
			System.out.println("DieselCarDecorator added : "+car);
		}
	}
}
