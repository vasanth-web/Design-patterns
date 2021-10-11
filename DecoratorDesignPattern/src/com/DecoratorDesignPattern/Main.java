package com.DecoratorDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car luxuryCar = new LuxuryCar();
		System.out.println(luxuryCar+"\n");
		
		PetrolCarDecorator carWithPetrolEngine = new PetrolCarDecorator(luxuryCar);
		carWithPetrolEngine.manufactureCar();
	}

}
