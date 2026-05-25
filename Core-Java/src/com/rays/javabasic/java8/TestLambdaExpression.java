package com.rays.javabasic.java8;

public class TestLambdaExpression {
    public static void main(String[] args) {

        FunctionalInt f = (a, b) -> {
            return a + b;
        };

        int a = 6;
        int b = 4;
        System.out.println(f.sum(a, b));
        System.out.println(f.subs(a, b));
        System.out.println(FunctionalInt.multiply(a, b));
    }
}
