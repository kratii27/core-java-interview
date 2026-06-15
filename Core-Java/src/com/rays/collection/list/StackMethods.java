package com.rays.collection.list;

import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {
        // STACK
        System.out.println("--------------------stack----------------------");
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.peek());
        System.out.println(s.pop());
    }
}
