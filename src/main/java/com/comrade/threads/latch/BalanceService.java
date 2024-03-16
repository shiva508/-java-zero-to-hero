package com.comrade.threads.latch;

import java.util.concurrent.CountDownLatch;

public class BalanceService implements Runnable{
    private CountDownLatch countDownLatch;

    public BalanceService(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        //Making database call and check
        try {
            System.out.println("Validating balance started....");
            Thread.sleep(1000);
            System.out.println("Validating balance completed....");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
