package com.rays.javabasic.java8;

@FunctionalInterface
public interface FunctionalInt {

    public int sum(int a, int b);

    public static int multiply(int a , int b){
        return  a * b;
    }

    public default int subs(int a, int b){
        return a - b;
    }
}
