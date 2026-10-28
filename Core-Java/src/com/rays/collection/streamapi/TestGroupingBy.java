package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGroupingBy {

    public static void main(String[] args) {
        
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Asha", "IT"));
        list.add(new Employee(2, "Rahul", "HR"));
        list.add(new Employee(3, "Neha", "IT"));
        list.add(new Employee(6, "Diana", "HR"));

        Map<String, List<Employee>> newList = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(newList);

    }

}
