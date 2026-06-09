package com.rays.oop.shapearray.withconstructor;

public class TestShape {
    public static double totalArea(Shape[] s){
        double totalArea = 0;

        for (int i = 0; i < s.length; i++) {
            totalArea = totalArea + s[i].area();
        }
        return totalArea;
    }

    public static void main(String[] args) {

        Shape[] s = new Shape[3];
        s[0] = new Rectangle(2, 2);
        s[1] = new Triangle(2, 2);
        s[2] = new Circle(2);

        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());

        System.out.println(totalArea(s));
    }
}
