package com.comrade.dsa.dsa_list.doubly_linked_list;

public class DoublyLinkedListClient {
    public static void main(String[] args) {
        CustomDoublyLinkedList customDoublyLinkedList=new CustomDoublyLinkedList("A");
        customDoublyLinkedList.iterateValues();
        customDoublyLinkedList.append("B");
        customDoublyLinkedList.iterateValues();
        customDoublyLinkedList.append("C");
        customDoublyLinkedList.iterateValues();
        customDoublyLinkedList.prepend("D");
        customDoublyLinkedList.iterateValues();
        customDoublyLinkedList.insert("E",2);
        customDoublyLinkedList.iterateValues();
    }
}
