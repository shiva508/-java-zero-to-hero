package com.comrade.collection.queue.blocking_queue;

import java.util.concurrent.BlockingQueue;

public class DepositService implements Runnable{

    private BlockingQueue<Integer> queue;

    public DepositService(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int counter=0;
        while (true){
            try {
                queue.put(counter);
                counter++;
                Thread.sleep(10);
                System.out.println("DepositService :"+counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
