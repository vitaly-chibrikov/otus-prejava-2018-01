package ru.otus.bad;

public class Blackbird {
    private final String name;
    private boolean isFlying;

    public Blackbird(String name) {
        this.name = "Blackbird";
        this.isFlying = false;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void feed() {
        isFlying = true;
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
