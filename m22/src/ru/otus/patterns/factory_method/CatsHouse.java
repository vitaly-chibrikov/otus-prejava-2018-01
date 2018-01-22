package ru.otus.patterns.factory_method;

/**
 * Created by tully.
 */
public class CatsHouse extends AnimalHouse {
    @Override
    protected Animal createAnimal() {
        return new Cat();
    }
}
