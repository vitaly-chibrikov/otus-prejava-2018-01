package ru.otus.patterns.observer;

/**
 * Created by tully.
 */
public class Main {
    public static void main(String[] args) {
        ErrorsReporter errorsReporter = new ErrorsReporter();

        Observer o1 = new OutObserver();

        errorsReporter.register(o1);
        errorsReporter.register(new OutObserver());
        errorsReporter.register(new ErrObserver());

        errorsReporter.unregister(o1);

        errorsReporter.notify(new Event());
    }
}
