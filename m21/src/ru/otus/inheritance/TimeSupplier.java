package ru.otus.inheritance;

public class TimeSupplier implements TimeSupplierInterface {

    @Override
    public long getTime() {
        return System.currentTimeMillis();
    }
}
