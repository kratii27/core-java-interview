package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestStudent {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(new Student(1, "krati"));
        list.add(new Student(3, "sanjana"));
        list.add(new Student(2, "aniket"));
        list.add(new Student(4, "krati"));

        Collections.sort(list);

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
