package com.comrade.threads.exchanger;

import java.util.concurrent.Exchanger;

public class DepositService implements Runnable{
    private int counter;
    private Exchanger<Integer> exchanger;
    public DepositService(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }
    @Override
    public void run() {
        while (true){
            counter++;
            System.out.println("DepositService-->Increament "+counter);
            try {
                counter=exchanger.exchange(counter);
                System.out.println("DepositService-->exchanger "+counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
