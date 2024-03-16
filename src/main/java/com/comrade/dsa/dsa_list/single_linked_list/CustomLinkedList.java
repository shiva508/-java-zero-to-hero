package com.comrade.dsa.dsa_list.single_linked_list;

import java.util.LinkedList;

public class CustomLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public CustomLinkedList() {
    }

    public CustomLinkedList(Node head) {
        this.head = head;
        this.head.setNext(null);
        this.tail = this.head;
        System.out.println(this.tail.hashCode()+"="+this.head.hashCode());
        length=1;
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
    public void append(String value){
        if (value != null) {
            addNewValue(value,  this.head);
        }
    }

    public void prepend(String value){
        if (value != null) {
            Node newNextNode=new Node(value,null);
            newNextNode.setNext(this.head);
            this.head=newNextNode;
            this.length++;
        }
    }

    public void addNewValueUsingTail(String value){
        Node newNextNode=new Node(value);
        this.tail.setNext(newNextNode);
        this.tail=newNextNode;
        this.length++;
    }


    public void addNewValue(String value, Node node){

        if (value != null && node !=null ) {
            if (null == node.getNext()){
                Node nextNode=new Node(value);
                node.setNext(nextNode);
                this.length++;
                this.tail=nextNode;
                value=null;
            }else {
                addNewValue(value, node.getNext());
            }
        }
    }
    public void addFirst(String value){

    }
    public void addLast(String value){

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
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
            //System.out.print(currentNode.getValue() +"-->");
            Node nextNode=currentNode.getNext();
            printValue(nextNode,builder);
        }
        return;
    }

    public void remove(int index){

        if (index>this.length){
            return;
        }else {
            Node previouseNode=null;
            Node currentNode=null;
            Node nextNode=null;
            for (int i = 0; i < this.length-1; i++) {
                if (i == 0) {
                    currentNode=this.getHead();
                    nextNode=currentNode.getNext();
                }else{
                    if(previouseNode==null){
                        previouseNode=currentNode;
                    }else{
                        previouseNode.setNext(currentNode);
                        previouseNode.getNext().setNext(null);
                    }
                    currentNode=nextNode;
                    nextNode=currentNode.getNext();
                }

                if (i==index){
                    this.length--;
                    if (i == 0) {
                        this.head=currentNode;
                    }else {
                        this.head=previouseNode;
                        nodeAppender(this.head,nextNode);
                    }
                    break;
                }
            }
        }
    }

    public void nodeAppender(Node node, Node tailNode){
        String value="";
        boolean isDataSet=false;
        if (null !=tailNode) {
            if (null == node.getNext()){
                node.setNext(tailNode);
                this.tail=node;
                tailNode=null;
            }else {
                nodeAppender(node.getNext(), tailNode);
            }
        }
    }

    @Override
    public String toString() {
        return "CustomLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
