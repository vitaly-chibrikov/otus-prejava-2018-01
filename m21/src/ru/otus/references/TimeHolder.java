package ru.otus.references;

import ru.otus.inheritance.TimeSupplierInterface;

public class TimeHolder {
    private TimeSupplierInterface timeSupplier;

    public TimeHolder(TimeSupplierInterface timeSupplier) {
        setTimeSupplier(timeSupplier);
    }

    public void printTime() {
        System.out.println("POSIX: " + timeSupplier.getTime());
    }

    public void setTimeSupplier(TimeSupplierInterface timeSupplier){
        this.timeSupplier = timeSupplier;
    }
}

