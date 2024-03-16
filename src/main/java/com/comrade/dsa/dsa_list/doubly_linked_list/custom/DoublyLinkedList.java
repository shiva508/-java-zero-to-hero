package com.comrade.dsa.dsa_list.doubly_linked_list.custom;

public class DoublyLinkedList {
    private CustomNode head;
    private CustomNode tail;
    int size=0;

    public DoublyLinkedList() {
    }

    public void addAtFront(int value){
        CustomNode headNode=new CustomNode(value);
        if (size==0){
            head=headNode;
            tail=headNode;
            size++;
        }else {
            headNode.next=head;
            head.prev=headNode;
            head=headNode;
            size++;
        }
    }

    public void addAtBack(int value){
        CustomNode tailNode=new CustomNode(value);
        if (size==0){
            tail=tailNode;
            head=tail;
            size++;
        }else {
            tailNode.prev=tail;
            tail.next=tailNode;
            tail=tailNode;
            size++;
        }
    }

    public void addAtIndex(int index,int value){
        CustomNode newNode=new CustomNode(value);
        if (size==0){
            this.addAtFront(value);
        } else if (size==index) {
            this.addAtBack(value);
        } else {
            CustomNode currentNode=null;
            for (int i=0;i<size-1;i++){

            }
        }
    }
}
