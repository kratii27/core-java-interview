package com.rays.exception;

public class TestArithmeticException {
    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 5;
            System.out.println(b / a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}