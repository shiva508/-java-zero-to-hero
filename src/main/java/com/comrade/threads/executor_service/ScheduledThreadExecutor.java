package com.comrade.threads.executor_service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadExecutor {
    public static void main(String[] args) {
        long initialDelay=1000;
        long runAtEach=2000;

        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(new ConfidentialHacking(),initialDelay,runAtEach,TimeUnit.MILLISECONDS);
    }
}
