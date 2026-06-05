package com.rays.oop;

public class MethodOverloading {

    public int sum(int a, int b){
        return a + b;
    }

    public int sum(int a, int b,int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading test = new MethodOverloading();
        System.out.println(test.sum(2,2));
        System.out.println(test.sum(2, 2, 1));
    }
}
