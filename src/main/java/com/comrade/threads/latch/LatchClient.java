package com.comrade.threads.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LatchClient {
    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(8);
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new SignalSampler(i,latch));
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
        System.out.println("Data count finished");
    }
}
