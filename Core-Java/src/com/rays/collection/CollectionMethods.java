package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);

        Collection c1 = new ArrayList();
        c1.add(1);

        System.out.println(c);
        c.add(3);
        System.out.println(c);
        c.addAll(c);
        System.out.println(c);
        System.out.println(c.contains(9));
        System.out.println(c.containsAll(c1));
        System.out.println(c.size());
        c.remove(3);
        c.remove(3);
        System.out.println(c);
        c.removeAll(c1);
        System.out.println(c);
        System.out.println(c.isEmpty());

        c.clear();
        System.out.println(c);
    }

}
