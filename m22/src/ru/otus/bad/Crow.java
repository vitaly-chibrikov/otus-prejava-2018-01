package ru.otus.bad;

public class Crow {
    private final String name;
    private boolean isFlying;

    public Crow(String name) {
        this.name = "Crow";
        this.isFlying = false;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void feed() {
        isFlying = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", isFlying=" + isFlying +
                '}';
    }
}
