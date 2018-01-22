package ru.otus.patterns.singleton;

/**
 * Created by tully.
 */
public class Main {
    public static void main(String[] args) {
        Singleton.instance().setMessage("Hello");

        new Main().print();
    }

    private void print(){
        System.out.println(Singleton.instance().getMessage());
    }
}
