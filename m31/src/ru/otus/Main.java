package ru.otus;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);

        String sizeString = System.getProperty("size", "1000");
        int size = Integer.valueOf(sizeString);
        System.out.println(size);

        OOMExample(size);

        //xssExample();
    }

    private static void xssExample() {
        try {
            recursive(0);
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("InfiniteRecursion")
    private static void recursive(int a) {
        System.out.println(a);
        recursive(++a);
    }

    private static void OOMExample(int size) {
        BigObject[] bigObjects = new BigObject[size];
        for (int i = 0; i < size; i++) {
            //System.out.println(i);
            bigObjects[i] = new BigObject();
        }
        System.out.println("Created: " + bigObjects.length);
    }

    private static class BigObject {
        int[] bigArray = new int[1024 * 1024];

        public int[] getBigArray() {
            return bigArray;
        }
    }
}
