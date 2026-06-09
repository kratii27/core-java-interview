package com.rays.oop.cloning;

public class TestShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCloning sc = new ShallowCloning();
        sc.balance = 200;

        ShallowCloning sc2 = (ShallowCloning) sc.clone();
        sc.balance = 400;

        System.out.println(sc.balance);
        System.out.println(sc2.balance);
    }
}
