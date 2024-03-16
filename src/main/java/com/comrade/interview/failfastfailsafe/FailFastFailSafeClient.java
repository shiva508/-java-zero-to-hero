package com.comrade.interview.failfastfailsafe;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailFastFailSafeClient {
    public static void main(String[] args) {
        //failFastMap();
        //failFastSet();
        //failSafeMap();
        //failSafeSet();
    }

    private static void failSafeSet() {
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add("A");
        copyOnWriteArraySet.add("B");
        copyOnWriteArraySet.add("C");
        Iterator<String> stringIterator = copyOnWriteArraySet.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
            copyOnWriteArraySet.add("D");
        }
    }

    private static void failSafeMap() {
        ConcurrentHashMap<String,String> concurrentHashMap =new ConcurrentHashMap<>();
        concurrentHashMap.put("A", "Apple");
        concurrentHashMap.put("B", "Ball");
        concurrentHashMap.put("C", "Cat");
        Iterator<String> stringIterator = concurrentHashMap.keySet().iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
            concurrentHashMap.put("D","Dog");
        }
    }

    private static void failFastSet() {
        Set<String> stringList = new HashSet<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            stringList.add("D");
        }
    }

    private static void failFastMap() {
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("A", "Apple");
        stringStringMap.put("B", "Ball");
        stringStringMap.put("C", "Cat");
        Iterator<String> iterator = stringStringMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            stringStringMap.put("D","Dog");
        }
    }
}
