package ru.otus.patterns.factory_method;

/**
 * Created by tully.
 */
public class DogsHouse extends AnimalHouse {
    @Override
    protected Animal createAnimal() {
        return new Dog();
    }
}
