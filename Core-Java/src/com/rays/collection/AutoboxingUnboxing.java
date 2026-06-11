package com.rays.collection;

import java.util.ArrayList;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        
        // AUTOBOXING
        int a = 5;
        Integer b = a;
        
        // UNBOXING
        Integer c = 5;
        int d = c;

        // COLLECTION
        ArrayList<Integer> list = new ArrayList<>();
        // AUTOBOXING
        list.add(10);
        list.add(20);

        System.out.println("List: " + list);

        // UNBOXING
        int num = list.get(0);

        System.out.println("First Element: " + num);
    }
}
