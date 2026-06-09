package com.rays.oop.overriding;

public class Rectangle extends Shape {
    public double length;
    public double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area(){
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(2);
        r.setWidth(2);
        System.out.println(r.area());
    }
}
