package com.comrade.threads.create.thread;

public class FdmaProcessor extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("FDMA :"+i);
        }
    }
}
