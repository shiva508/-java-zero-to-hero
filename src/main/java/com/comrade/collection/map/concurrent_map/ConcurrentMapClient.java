package com.comrade.collection.map.concurrent_map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapClient {
    public static void main(String[] args) {
        ConcurrentMap<String,Integer> map=new ConcurrentHashMap<>();
        DepositService depositService=new DepositService(map);
        WithdrownService withdrownService=new WithdrownService(map);
        new Thread(depositService).start();
        new Thread(withdrownService).start();
    }
}
