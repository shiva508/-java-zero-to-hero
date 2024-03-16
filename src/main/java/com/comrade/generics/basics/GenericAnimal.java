package com.comrade.generics.basics;

public class GenericAnimal {
	public static void main(String[] args) {
		GenericAnimalPrinter<Cat> catPrinter = new GenericAnimalPrinter<Cat>(new Cat());
		GenericAnimalPrinter<Dog> dogPrinter = new GenericAnimalPrinter<Dog>(new Dog());
	}
}
