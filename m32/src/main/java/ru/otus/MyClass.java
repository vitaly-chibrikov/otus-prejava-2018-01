package ru.otus;

// to compile with the library
// javac -cp C:\Users\vitaly.chibrikov\.m2\repository\com\google\guava\guava\23.0\guava-23.0.jar -d out src\main\java\ru\otus\MyClass.java


// download from https://mvnrepository.com/artifact/com.google.guava/guava/23.0
// or use maven
//import com.google.common.collect.Lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

// to unzip jar file use unzip or 7zip
// for example: 7z x out.jar -ojout

public class MyClass {
    public static void main(String[] args) {
        //test(Lists.asList("Sully", args).toString());
        //resourcesExample();
        test("Sully");
    }

    private static void test(String name) {
        System.out.println("Hello " + name);
    }

    private static void resourcesExample() {
        URL url = MyClass.class.getResource("/resources/hello.txt"); //local path starts with '/'
        System.out.println(url);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            System.out.println(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
