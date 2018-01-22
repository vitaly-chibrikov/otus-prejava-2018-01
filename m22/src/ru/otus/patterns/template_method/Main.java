package ru.otus.patterns.template_method;

/**
 * Created by tully.
 */
public class Main {
    public static void main(String[] args) {
        BinaryOperation plus = new Plus(1, 2);
        BinaryOperation minus = new Minus(1, 2);

        System.out.println(plus.getResult());
        System.out.println(minus.getResult());
    }
}
