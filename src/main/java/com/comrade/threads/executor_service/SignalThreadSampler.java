package com.comrade.threads.executor_service;

import java.util.concurrent.TimeUnit;

public class SignalThreadSampler implements Runnable{
    private final int rate;

    public SignalThreadSampler(int rate) {
        this.rate = rate;
    }

    @Override
    public void run() {

        System.out.println("Task with rate :"+rate+" executing "+Thread.currentThread().getName());
        long v =(long)(Math.random() * 5) ;
        try {
            TimeUnit.MILLISECONDS.sleep(v);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
