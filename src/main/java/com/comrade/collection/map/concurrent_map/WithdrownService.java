package com.comrade.collection.map.concurrent_map;

import java.util.concurrent.ConcurrentMap;
public class WithdrownService implements Runnable {
    private ConcurrentMap<String,Integer> map;
    public WithdrownService(ConcurrentMap<String,Integer> map) {
        this.map = map;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println(map.get("A"));
            Thread.sleep(2000);
            System.out.println(map.get("B"));
            System.out.println(map.get("C"));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
