package com.rays.javabasic.java8;

public class TestAnonymousFunction {
    public static void main(String[] args) {
        FunctionalInt f = new FunctionalInt() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };

        System.out.println(f.sum(6, 4));
        System.out.println(f.subs(7, 3));
        System.out.println(FunctionalInt.multiply(2, 4));
    }
}
