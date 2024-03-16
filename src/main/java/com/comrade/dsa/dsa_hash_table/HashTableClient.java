package com.comrade.dsa.dsa_hash_table;

import java.util.List;

public class HashTableClient {
    public static void main(String[] args) {
        CustomHashTable customHashTable=new CustomHashTable();
        customHashTable.put("a","Apple");
        customHashTable.put("a","Ant");
        customHashTable.put("b","Ball");
        customHashTable.put("z","Zoo");
        customHashTable.put("m","Mango");
        List<CustomNode> customNodes = customHashTable.getCustomNodes();
        System.out.println(customNodes);
        System.out.println(customHashTable.getByKey("m"));
    }
}