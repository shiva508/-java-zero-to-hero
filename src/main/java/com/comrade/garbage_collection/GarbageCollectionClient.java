package com.comrade.garbage_collection;

public class GarbageCollectionClient {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory  " + runtime.totalMemory());
        System.out.println("Free memory   " + runtime.freeMemory());
        for (int i = 0; i < 1000 ; i++) {
            User user = new User("User Info"+i);
            user = null;
        }
        System.out.println("Total memory  " + runtime.totalMemory());
        runtime.gc();
        System.out.println("Free memory   " + runtime.freeMemory());
    }
}