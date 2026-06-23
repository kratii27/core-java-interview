package com.rays.collection.streamapi;

import com.rays.collection.streamapi.EmployeeSalary;

import java.util.ArrayList;
import java.util.List;

// salary >= 20000
public class TestEmployeeSalary {

	public static void main(String[] args) {

		List<EmployeeSalary> list = new ArrayList<EmployeeSalary>();

		list.add(new EmployeeSalary(20000, "abc"));
		list.add(new EmployeeSalary(25000, "xyz"));
		list.add(new EmployeeSalary(1000, "harry"));
		list.add(new EmployeeSalary(522, "abcc"));
		list.add(new EmployeeSalary(600, "xyzz"));

		list.stream().distinct().filter(c -> (c.getSalary() >= 20000))
				.forEach(c -> System.out.println(c.getSalary() + "=" + c.getName()));

	}

}