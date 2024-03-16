package com.comrade.threads.deamon_worker_thread;

public class TdmaProcessor implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("TDMA :"+i);
        }
    }
}
