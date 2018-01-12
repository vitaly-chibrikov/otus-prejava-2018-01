package ru.otus;

import ru.otus.printer.BinaryPrinter;

public class Main {

    public static void main(String[] args) {
        BinaryPrinter printer = createPrinter(12);

        System.out.println("Size:" + printer.getSize());

        int value = 1;
        doPrint(printer, value);
        System.out.println("Size:" + printer.getSize());
    }

    private static BinaryPrinter createPrinter(int size) {
        return new BinaryPrinter(size);
    }

    private static void doPrint(BinaryPrinter printer, int value) {
        printer.print(value);
        try {
            printer.setSize(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
