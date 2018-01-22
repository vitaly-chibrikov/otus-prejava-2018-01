package ru.otus.inheritance;

public class POSIXTimeSupplier extends TimeSupplier {
    public long getTime() {
        return super.getTime() / 1000;
    }
}
