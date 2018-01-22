package ru.otus;

import ru.otus.inheritance.POSIXTimeSupplier;
import ru.otus.inheritance.TimeSupplier;
import ru.otus.inheritance.TimeSupplierInterface;
import ru.otus.references.TimeHolder;

public class Main {
    public static void main(String[] args) {
        TimeSupplierInterface timeSupplier = new TimeSupplier();
        TimeHolder holder = new TimeHolder(timeSupplier);
        holder.printTime();
        holder.setTimeSupplier(new POSIXTimeSupplier());
        holder.printTime();
    }
}
