package com.comrade.threads.latch;

import java.util.concurrent.CountDownLatch;

public class DocumentsValidatorService  implements Runnable{
    private CountDownLatch countDownLatch;

    public DocumentsValidatorService(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        //Making database call and check
        try {
            System.out.println("Validating documents started....");
            Thread.sleep(1000);
            System.out.println("Validating documents completed....");
            countDownLatch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
