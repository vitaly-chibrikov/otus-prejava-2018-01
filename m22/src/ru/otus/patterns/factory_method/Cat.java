package ru.otus.patterns.factory_method;

/**
 * Created by tully.
 */
public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
