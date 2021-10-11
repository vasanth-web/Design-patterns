package com.AdaptorDesignPattern;

public class AnimalAdapter implements ToyElephant{
	Animal animal;
	public AnimalAdapter (Animal animal) {
		this.animal = animal;
	}
	public void rumbles() {
		animal.makeSound();
	}
}
