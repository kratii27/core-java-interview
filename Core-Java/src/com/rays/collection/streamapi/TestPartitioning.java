package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestPartitioning {

    public static void main(String[] args) {
        
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "John", "IT"));
        list.add(new Employee(2, "Jane", "HR"));
        list.add(new Employee(3, "Bob", "IT"));
        list.add(new Employee(4, "Alice", "HR"));
        list.add(new Employee(5, "Charlie", "IT"));
        list.add(new Employee(6, "Diana", "HR"));

        Map<Boolean, List<Employee>> newList = list.stream().collect(Collectors.partitioningBy(e -> e.getDepartment().equals("IT")));

        System.out.println(newList);

    }

}
