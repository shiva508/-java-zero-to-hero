package com.comrade.collection.queue.priority_queue;

import java.util.concurrent.PriorityBlockingQueue;

public class DepositService implements Runnable{

    private PriorityBlockingQueue<String> queue;

    public DepositService(PriorityBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        try {
            queue.put("I");
            queue.put("Love");
            queue.put("You");
            Thread.sleep(2000);
            queue.put("LoL");
            Thread.sleep(1000);
            queue.put("Not Now");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

