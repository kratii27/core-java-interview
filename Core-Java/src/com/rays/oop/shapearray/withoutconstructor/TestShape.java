package com.rays.oop.shapearray.withoutconstructor;

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
        s[0] = new Rectangle();
        s[1] = new Triangle();
        s[2] = new Circle();

        Rectangle r = (Rectangle) s[0];
        r.setLength(2);
        r.setWidth(2);
        System.out.println(s[0].area());

        Triangle t = (Triangle) s[1];
        t.setBase(2);
        t.setHeight(2);
        System.out.println(s[1].area());

        Circle c = (Circle) s[2];
        c.setRadius(2);
        System.out.println(s[2].area());

        System.out.println(totalArea(s));
    }
}
