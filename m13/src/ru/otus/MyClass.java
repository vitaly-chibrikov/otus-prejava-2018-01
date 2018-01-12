package ru.otus;

public class MyClass {
    int a = 10;
    boolean t = true;

    public MyClass(){}

    public MyClass(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", t=" + t +
                '}';
    }
}
