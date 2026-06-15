package com.rays.collection;

public class EqualsAndHashcode {

    String name;
    int salary;

    public EqualsAndHashcode(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        String s = this.name + this.salary;
        return s.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (!(obj instanceof EqualsAndHashcode)){
            return false;
        }
        EqualsAndHashcode e = (EqualsAndHashcode) obj;
        String str1 = this.name + this.salary;
        String str2 = e.name + e.salary;

        return str1.equals(str2);
    }


    @Override
    public String toString() {
        String s = this.name + " " + this.salary;
        return s;
    }
}
