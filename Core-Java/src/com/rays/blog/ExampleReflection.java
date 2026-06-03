package com.rays.blog;

import java.lang.reflect.Constructor;

public class ExampleReflection {
    public void display() {
        System.out.println("Object created using Constructor.newInstance()");
    }

    public static void main(String[] args) {
        try {
            Constructor<ExampleReflection> constructor = ExampleReflection.class.getDeclaredConstructor();
            ExampleReflection example = constructor.newInstance();
            example.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}