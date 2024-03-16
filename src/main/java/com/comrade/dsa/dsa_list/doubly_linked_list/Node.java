package com.comrade.dsa.dsa_list.doubly_linked_list;

public class Node {
    private String value;

    private Node next;

    private Node prev;

    public Node(String value) {
        this.value = value;
        this.next=null;
        this.prev=null;
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }


    @Override
    public String toString() {
        return "{" +
                "value='" + value + '\'' +
                '}';
    }
}
