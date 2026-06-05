package com.rays.oop;

public class TestInterface implements InterfaceExample {

    @Override
    public double circleArea(double radius){
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        TestInterface test = new TestInterface();
        double area = test.circleArea(2.0);
        System.out.println(area);
    }
}
