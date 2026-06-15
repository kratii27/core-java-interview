package com.rays.collection.list;

public class LinkedListMethods {
    public static void main(String[] args) {
        // LINKED LIST
        System.out.println("-----------------linked list-------------------");
        java.util.LinkedList list2 = new java.util.LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        System.out.println(list2.element());
        System.out.println(list2.getFirst());
        System.out.println(list2.getLast());
        System.out.println(list2.peek());
        System.out.println(list2.peekFirst());
        System.out.println(list2.peekLast());
        System.out.println(list2.offer(40));
        System.out.println(list2);
        System.out.println(list2.offerFirst(05));
        System.out.println(list2.offerLast(50));
        System.out.println(list2);
    }
}
