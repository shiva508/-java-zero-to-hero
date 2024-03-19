package com.comrade.threads.latch;

import java.util.concurrent.CountDownLatch;

public class BankOperationsClient {

    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(3);
        Thread balanceCheck=new Thread(new BalanceService(countDownLatch));
        Thread documentCheck=new Thread(new DocumentsValidatorService(countDownLatch));
        Thread sibbleCheck=new Thread(new SibbleScoreService(countDownLatch));
        balanceCheck.start();
        documentCheck.start();
        sibbleCheck.start();
        try {
            countDownLatch.wait();
            loanGrantStatus();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static void loanGrantStatus() {
        System.out.println("Granting loan");
    }
}
