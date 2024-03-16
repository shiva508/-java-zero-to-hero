package com.comrade.collection.map.concurrent_map;

import java.util.concurrent.ConcurrentMap;
public class DepositService implements Runnable{
    private ConcurrentMap<String,Integer> map;
    public DepositService(ConcurrentMap<String, Integer> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            map.put("A",408);
            Thread.sleep(1000);
            map.put("B",508);
            map.put("C",608);
            Thread.sleep(2000);
            map.put("D",708);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
