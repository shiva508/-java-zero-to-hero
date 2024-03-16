package com.comrade.threads.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorClient {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new SignalThreadSampler(i));
        }
    }
}
