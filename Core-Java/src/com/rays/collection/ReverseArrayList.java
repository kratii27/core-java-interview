package com.rays.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
