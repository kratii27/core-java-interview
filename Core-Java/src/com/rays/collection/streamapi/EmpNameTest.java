package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpNameTest {
	public static void main(String[] args) {
		List<Emp> l = new ArrayList();
		l.add(new Emp(1, "abc"));
		l.add(new Emp(4, "xyz"));
		l.add(new Emp(2, "abcc"));
		l.add(new Emp(8, "xyzz"));

		l.stream().sorted(Comparator.comparing(Emp::getName))
				.forEach(e -> System.out.println(e.getId() + " = " + e.getName()));

	}

}