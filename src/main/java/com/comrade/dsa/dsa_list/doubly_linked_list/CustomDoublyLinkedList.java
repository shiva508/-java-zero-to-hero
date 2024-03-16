package com.comrade.dsa.dsa_list.doubly_linked_list;

public class CustomDoublyLinkedList {

    private Node head;
    private Node tail;
    private int length=0;

    public CustomDoublyLinkedList(String value){
        this.head=new Node(value);
        this.tail=this.head;
        this.length++;
    }

    public void append(String value){
        Node newNode=new Node(value);
        newNode.setPrev(this.tail);
        this.tail.setNext(newNode);
        this.tail=newNode;
        this.length++;
    }

    public void prepend(String value){
        if (value != null) {
            Node newNextNode=new Node(value);
            this.head.setPrev(newNextNode);
            newNextNode.setNext(this.head);
            this.head=newNextNode;
            this.length++;
        }
    }

    public void insert(String value, int index){

        if(index>= this.length){
            this.append(value);
        }else {
            Node prefixNode=this.getHead();
            for (int i = 0; i < this.length-1; i++) {
                prefixNode=prefixNode.getNext();
                if (index==i){
                    Node newInsertNode=new Node(value,null);
                    Node existingTailNodes=prefixNode.getNext();
                    newInsertNode.setNext(existingTailNodes);
                    prefixNode.setNext(newInsertNode);
                    this.length++;
                    break;
                }
            }
        }
    }

    public void iterateValues(){
        StringBuilder builder=new StringBuilder("");
        printValue(head,builder);
        builder.replace(builder.length()-3,builder.length(),"");
        System.out.println(builder.toString());
    }

    private void printValue(Node currentNode,StringBuilder builder){
        if (null !=currentNode){
            builder.append(currentNode.getValue() +"-->");
            Node nextNode=currentNode.getNext();
            printValue(nextNode,builder);
        }
        return;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
