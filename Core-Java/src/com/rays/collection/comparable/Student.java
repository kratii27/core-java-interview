package com.rays.collection.comparable;

public class Student implements Comparable<Student>{

    public int id;
    public String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(Student o) {
//        if (this.name.equals(o)){
            return this.id - o.id;
//        } else {
//            return this.id.compareTo(o.id);
//        }
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
