package com.rays.oop.shapearray.withoutconstructor;

public class Triangle extends Shape{

    public double base;
    public double height;

    public double getBase(){
        return base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height)/ 2;
    }
}
