package com.rays.javabasic.java8;

@FunctionalInterface
public interface MyFunctionalInterface {

    public void greet();

    public static void sayHello() {
        System.out.println("Hello from static method");
    }

    public default void sayHi() {
        System.out.println("Hi from default method");
    }

    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> System.out.println("Hello from lambda expression");
        obj.greet();
        obj.sayHi();
        MyFunctionalInterface.sayHello();
    }

}

