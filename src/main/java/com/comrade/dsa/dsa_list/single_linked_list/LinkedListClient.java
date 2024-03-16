package com.comrade.dsa.dsa_list.single_linked_list;

public class LinkedListClient {
    public static void main(String[] args) {
        Node node= new Node("A",null);
        CustomLinkedList customLinkedList=new CustomLinkedList(node);
        //customLinkedList.append("B");
        //customLinkedList.append("C");
        customLinkedList.addNewValueUsingTail("B");
        customLinkedList.addNewValueUsingTail("C");
        customLinkedList.addNewValueUsingTail("D");
        customLinkedList.addNewValueUsingTail("E");
        //customLinkedList.prepend("0");
        //customLinkedList.insert("M",2);
        //customLinkedList.insert("N",3);
        customLinkedList.addNewValueUsingTail("F");
        customLinkedList.iterateValues();
        //customLinkedList.insert("W",30);
        //customLinkedList.insert("O",7);
        //customLinkedList.remove(0);
        customLinkedList.remove(2);
        customLinkedList.iterateValues();
    }
}
