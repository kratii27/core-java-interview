package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TestDistict {

    public static void main(String[] args) {
        
        Collection<String> list = Arrays.asList("abc", "xyz", "abc");

        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());

        System.out.println(distinctList);
    }

}
