package com.blogspot.huyhungdinh.factory;

public class Run {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal animal1 = animalFactory.getAnimal("cat");
		animal1.born();
		Animal animal2 = animalFactory.getAnimal("dog");
		animal2.born();
		Animal animal3 = animalFactory.getAnimal("hooman");
		animal3.born();
	}
}
