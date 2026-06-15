package com.rays.collection.list;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        // ARRAY LIST
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(4);

        System.out.println(list);
        list.add(2, 3);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.hashCode());
        System.out.println(list.indexOf(2));
        System.out.println(list.subList(0, 2));
        System.out.println(list.lastIndexOf(2));
    }
}
