package com.AdaptorDesignPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion lion = new Lion();
		ToyElephant elephant = new PlasticToyElephant();
		
		ToyElephant animalAdapter = new AnimalAdapter(lion);
		
		System.out.println("Lion..");
		lion.eat();
		lion.makeSound();
		
		System.out.println("Toy Elephant..");
		elephant.rumbles();
		
		System.out.println("Animal Adapter..");
		animalAdapter.rumbles();
	
	}

}
