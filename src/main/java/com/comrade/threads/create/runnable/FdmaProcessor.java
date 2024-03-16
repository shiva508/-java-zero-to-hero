package com.comrade.threads.create.runnable;

public class FdmaProcessor implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("FDMA :"+i);
        }
    }
}
