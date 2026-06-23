package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpIdTest {
	public static void main(String[] args) {

		List<Emp> l = new ArrayList();
		l.add(new Emp(1, "krati"));
		l.add(new Emp(4, "harry"));
		l.add(new Emp(2, "abc"));
		l.add(new Emp(8, "xyz"));

		l.stream().sorted(Comparator.comparingInt(Emp::getId))
				.forEach(e -> System.out.println(e.getId() + " =" + e.getName()));

	}

}