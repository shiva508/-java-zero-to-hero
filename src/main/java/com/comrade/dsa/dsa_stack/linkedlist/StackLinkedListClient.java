package com.comrade.dsa.dsa_stack.linkedlist;

public class StackLinkedListClient {
    public static void main(String[] args) {
        StackLinkedList stackLinkedList=new StackLinkedList();
        stackLinkedList.pop(1);
        stackLinkedList.print();
        stackLinkedList.pop();
        stackLinkedList.pop();
        stackLinkedList.print();
    }
}
