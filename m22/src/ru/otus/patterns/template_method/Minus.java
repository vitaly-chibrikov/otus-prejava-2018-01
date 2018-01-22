package ru.otus.patterns.template_method;

/**
 * Created by tully.
 */
public class Minus extends BinaryOperation {
    Minus(int a, int b) {
        super(a, b);
    }

    @Override
    protected int apply(int a, int b) {
        return a - b;
    }
}
