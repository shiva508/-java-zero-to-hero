package com.comrade.dsa.dsa_trees.binary_tree;

import com.google.gson.Gson;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(9);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(20);
        binaryTree.insert(170);
        binaryTree.insert(15);

        System.out.println(new Gson().toJson(binaryTree));
        System.out.println( binaryTree.lookup(15));
        System.out.println( binaryTree.lookup(508));
    }
}
