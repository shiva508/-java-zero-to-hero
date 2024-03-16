package com.comrade.threads.latch;

import java.util.concurrent.CountDownLatch;

public class SignalSampler implements Runnable{
    private int count;
    private CountDownLatch latch;

    public SignalSampler(int count, CountDownLatch latch) {
        this.count = count;
        this.latch = latch;
    }

    @Override
    public void run() {
        translateText();
        latch.countDown();
    }

    private void translateText() {
        try {
            System.out.println("Started Task "+count);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
