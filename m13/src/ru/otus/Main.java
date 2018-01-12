package ru.otus;

import java.util.Arrays;

public class Main {

    public static void main(String... args){
        System.out.println("start");
        throw new RuntimeException("hello");
        //System.out.println("finish");
    }

    private static void arraysHelperExample() {
        int[] values = new int[]{1, 1, 2, 3, 5, 8, 13};
        System.out.println(Arrays.binarySearch(values, 5));
        System.out.println(Arrays.toString(values));
    }

    private static void stringsExample() {
        String str1 = "abc";
        String str2 = new String(new char[]{'a', 'b', 'c'});

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1.contains("bc"));

        System.out.println("a" + "b" + "d");

        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            tmp.append(i).append("_");
        }
        System.out.println(tmp.toString());
    }

    private static void arraysExample() {
        int[] anArray1 = new int[10];
        int[] anArray2 = {0, 1, 2, 3};
        MyClass[] objArray = new MyClass[5];

        System.out.println(objArray.toString());
        for (int i = 0; i < objArray.length; i++) {
            objArray[i] = new MyClass(i);
        }

        for (int i = 0; i < objArray.length; i++) {
            MyClass element = objArray[i];
            System.out.println(element);
        }
    }

    private static void equalsExample() {
        MyClass myClass1 = new MyClass();
        System.out.println(myClass1.toString());

        MyClass myClass2 = new MyClass();
        System.out.println(myClass2.toString());

        System.out.println(myClass1 == myClass2);
        System.out.println(myClass1.equals(myClass2));
    }
}
