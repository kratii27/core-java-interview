package com.rays.collection;

import java.util.*;

public class EqualsAndHashcodeTest {
    public static void main(String[] args) {

        EqualsAndHashcode e1 = new EqualsAndHashcode("krati", 70000);
        EqualsAndHashcode e2 = new EqualsAndHashcode("sanjana", 70000);
        EqualsAndHashcode e3 = new EqualsAndHashcode("aniket", 70000);

        if (e1.equals(e2)){
            if (e1.hashCode() == e2.hashCode()){
                System.out.println("EQUAL");
            }
        } else {
            System.out.println("not equals");
        }

        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());


        System.out.println("---------------------------------------------");
        // tEST THROUGH COLLECTIOn
        List l = new ArrayList<>();
        l.add(e1);
        System.out.println(l);

        l.remove(e1);
        System.out.println(l);

        System.out.println("setttttttttt");
        Set s = new HashSet();
        s.add(e1);
        System.out.println(s);

        s.add(e1);
        System.out.println(s);

        s.add(e2);
        System.out.println(s);

        System.out.println("mapppppppp");
        Map m = new HashMap();

        m.put(1, e1);
        m.put(2, e3);
        System.out.println(m + "hhhh");

        m.remove(1, e2);
        System.out.println(m);
    }
}
