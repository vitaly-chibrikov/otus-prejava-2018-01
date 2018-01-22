package ru.otus.patterns.factory_method;

/**
 * Created by tully.
 * <p>
 * Framework in the Factory method pattern.
 */
public abstract class AnimalHouse {
    private final Animal animal;

    AnimalHouse() {
        //build a house
        //add a bowl
        //add toys

        //create an animal
        animal = createAnimal();
        animal.makeSound();
    }

    protected abstract Animal createAnimal();

    public Animal getAnimal() {
        return animal;
    }
}
