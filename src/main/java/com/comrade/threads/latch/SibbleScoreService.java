package com.comrade.threads.latch;

import java.util.concurrent.CountDownLatch;

public class SibbleScoreService implements Runnable {

    private CountDownLatch countDownLatch;

    public SibbleScoreService(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        //Making database call and check
        try {
            System.out.println("Validating Sibble score started....");
            Thread.sleep(2000);
            System.out.println("Validating Sibble score completed....");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
