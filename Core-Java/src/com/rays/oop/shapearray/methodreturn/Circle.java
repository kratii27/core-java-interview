package com.rays.oop.shapearray.methodreturn;

public class Circle extends Shape {

    public static final double PI = 3.14;
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}
