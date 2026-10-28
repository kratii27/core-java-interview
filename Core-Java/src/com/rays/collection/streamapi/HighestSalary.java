package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;

public class HighestSalary {

    public static void main(String[] args) {

        ArrayList<Emp> list = new ArrayList<Emp>();
        list.add(new Emp(5000, "abc"));
        list.add(new Emp(2000, "abc"));
        list.add(new Emp(8000, "abc"));
        list.add(new Emp(4000, "abc"));

        list.stream().map(e -> e.getId()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

    }

}
