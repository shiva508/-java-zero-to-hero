package com.comrade.dsa.dsa_stack.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StackLinkedList {
    Node headNode;

    public StackLinkedList() {
    }

    public void pop(int value){
        Node newNode=new Node(value);
        newNode.setNext(headNode);
        headNode=newNode;

    }


    public void pop(){
        if (headNode != null) {
            headNode=headNode.next;
        }
    }
    public void print(){
        List<String> list=new ArrayList<>();
        Node currentNode=headNode;
        while (null !=currentNode){
            list.add(String.valueOf(currentNode.getValue()));
            currentNode=currentNode.getNext();
        }
        String result= list.stream().collect(Collectors.joining("->"));
        System.out.println(result);
    }
}
