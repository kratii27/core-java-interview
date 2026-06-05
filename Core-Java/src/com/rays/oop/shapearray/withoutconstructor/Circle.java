package com.rays.oop.shapearray.withoutconstructor;

public class Circle extends Shape{

    public static final double PI = 3.14;
    public double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}
