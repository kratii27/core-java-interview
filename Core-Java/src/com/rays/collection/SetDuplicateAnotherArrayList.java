package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicateAnotherArrayList {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        HashSet unique = new HashSet();
        HashSet duplicate = new HashSet();

        for (Object o : list){
            if (!unique.add(o)){
                duplicate.add(o);
            }
        }
        System.out.println(list);
        System.out.println(unique);
        System.out.println(duplicate);
    }
}