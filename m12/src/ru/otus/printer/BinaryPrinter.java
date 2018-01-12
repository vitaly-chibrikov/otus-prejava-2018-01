package ru.otus.printer;

public class BinaryPrinter {
    private static final int DEFAULT_SIZE = 8;

    private int size;

    BinaryPrinter() {
        this.size = DEFAULT_SIZE;
    }

    public BinaryPrinter(int size) {
        this.size = size;
    }

    public void print(long value) {
        for (int i = size - 1; i >= 0; i--) {
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();

        //System.out.println(Long.toBinaryString(value));
    }

    public int getSize() {
        return size;
    }

    /**
     * @param size must be positive
     */
    public void setSize(int size) throws Exception {
        if (size <= 0) {
            throw new Exception("Illegal size: " + size);
        }
        this.size = size;
    }
}
