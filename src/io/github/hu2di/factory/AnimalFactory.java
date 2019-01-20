package io.github.hu2di.factory;

public class AnimalFactory {

	public Animal getAnimal(String name) {
		if (name == null) {
			return null;
		}

		if (name.equalsIgnoreCase("CAT")) {
			return new Cat();
		} else if (name.equalsIgnoreCase("DOG")) {
			return new Dog();
		} else if (name.equalsIgnoreCase("HOOMAN")) {
			return new Hooman();
		}

		return null;
	}
}
