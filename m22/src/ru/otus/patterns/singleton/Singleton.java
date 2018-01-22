package ru.otus.patterns.singleton;

/**
 * Created by tully.
 * <p>
 * Singleton pattern
 */
class Singleton {
    private static Singleton singleton;
    private String message;

    private Singleton() {
    }

    static Singleton instance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }
}
