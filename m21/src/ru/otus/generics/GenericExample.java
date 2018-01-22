package ru.otus.generics;

public class GenericExample<T> {
    private T value;

    private GenericExample(T value) {
        this.value = value;
    }

    private T getT() {
        return value;
    }

    public static void main(String[] args) {
        GenericExample<Integer> intObject = new GenericExample<>(1);
        Integer valueInteger = intObject.getT();

        GenericExample<String> stringObject = new GenericExample<>("word");
        String valueString = stringObject.getT();
    }
}
