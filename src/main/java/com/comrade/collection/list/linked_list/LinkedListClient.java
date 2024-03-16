package com.comrade.collection.list.linked_list;

import java.util.LinkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList<Integer> integers=new LinkedList<>();
        integers.add(10);
        System.out.println(integers);
        integers.addFirst(9);
        System.out.println(integers);
    }
}