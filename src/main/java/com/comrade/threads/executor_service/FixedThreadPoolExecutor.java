package com.comrade.threads.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExecutor {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100 ; i++) {
            executorService.execute(new SignalThreadSampler(i));
        }
        executorService.shutdown();
        try {
            if(!executorService.awaitTermination(1000, TimeUnit.MILLISECONDS)){
                //executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
