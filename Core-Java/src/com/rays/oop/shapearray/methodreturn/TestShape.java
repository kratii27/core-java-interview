package com.rays.oop.shapearray.methodreturn;

public class TestShape {
    public static void main(String[] args) {

        Shape s1 = Shape.getShape(1);
        Shape s2 = Shape.getShape(2);
        Shape s3 = Shape.getShape(3);

        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());

    }
}
