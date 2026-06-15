package com.rays.collection.list;

import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {
        // VECTOR
        System.out.println("--------------------vector----------------------");
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println(v.elementAt(0));
        System.out.println(v.subList(0,2));
        System.out.println(v.hashCode());
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}
