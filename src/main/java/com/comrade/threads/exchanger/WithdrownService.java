package com.comrade.threads.exchanger;

import java.util.concurrent.Exchanger;

public class WithdrownService implements Runnable {
    private int counter;
    private Exchanger<Integer> exchanger;
    public WithdrownService(Exchanger<Integer> exchanger) {
        this.exchanger = exchanger;
    }
    @Override
    public void run() {
        while (true){
            counter--;
            System.out.println("WithdrownService-->Increament "+counter);
            try {
                counter=exchanger.exchange(counter);
                System.out.println("WithdrownService-->exchanger "+counter);
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
