package com.comrade.interview.hashtablehashmap;

import java.util.Hashtable;

public class HashTableClient {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable=new Hashtable<>();
        hashtable.put("Shiva","Dasari");
        hashtable.put("Satish","Dasari");
        hashtable.putIfAbsent("Ravi","Dasari");
        var name= hashtable.get("Shiva");
        System.out.println(name);
    }
}
