package com.rays.blog;

public class ExampleClone implements Cloneable {
    public void display() {
        System.out.println("Object created using clone()");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            ExampleClone original = new ExampleClone();
            ExampleClone clone = (ExampleClone) original.clone();
            clone.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}