package com.comrade.dsa.dsa_trees.binary_tree;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.JsonAdapter;

public class BinaryTree {
    private Node rootNode;

    public BinaryTree() {
    }

    public void insertRecursive(int value, Node root){
        Node newNode=new Node(value);
        if (rootNode == null) {
            rootNode=newNode;
        } else if (value<root.getValue()) {
            
        }
    }
    public void insert(int value){
        Node newNode=new Node(value);

        Node currentNode = null;
        //We need to define root node: check if already defined
        if(rootNode==null){
            this.rootNode=newNode;
            return;
        }else {
            currentNode=this.rootNode;
            //We need to find place to insert value
            while (null !=currentNode && null !=newNode ){
                if(value<currentNode.getValue()){ //Left Node
                    if(null==currentNode.getLeft()){
                        currentNode.setLeft(newNode);
                        newNode=null;
                    }else {
                        currentNode=currentNode.getLeft();
                    }
                }else {
                    if (null ==currentNode.getRight()){
                        currentNode.setRight(newNode);
                        newNode=null;
                    }else {
                        currentNode=currentNode.getRight();
                    }
                }
            }
        }
    }

    public boolean lookup(int input) {
        boolean found=false;
        Node currentNode = null;
        if(null==this.rootNode){
        }else {
            currentNode=this.rootNode;
            while (null !=currentNode ){
                if(input<currentNode.getValue()){
                    currentNode=currentNode.getLeft();
                }else if(input>currentNode.getValue()) {
                    currentNode=currentNode.getRight();
                } else if (input==currentNode.getValue()) {
                    found=true;
                    currentNode=null;
                }
            }
        }
        return found;
    }

    public boolean remove(int input){
        boolean deleted=false;
        if (rootNode == null) {
            deleted=false;
        }else {
            Node currentNode=rootNode;
            Node parentNode=null;
            while (null==currentNode){
                if (input<currentNode.getValue()){
                    parentNode=currentNode;
                    currentNode=currentNode.getLeft();
                } else if (input>currentNode.getValue()) {
                    parentNode=currentNode;
                    currentNode=currentNode.getRight();
                } else if (input==currentNode.getValue()) {
                    if (null==currentNode.getRight()) {
                        if (parentNode == null) {
                            this.rootNode=currentNode.getLeft();
                        }
                    }
                }
            }
        }


        return deleted;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "rootNode=" + rootNode +
                '}';
    }
}
