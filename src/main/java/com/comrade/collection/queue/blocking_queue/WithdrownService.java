package com.comrade.collection.queue.blocking_queue;

import java.util.concurrent.BlockingQueue;

public class WithdrownService implements Runnable {
    private BlockingQueue<Integer> queue;

    public WithdrownService(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true){
            try {
                var take = queue.take();
                Thread.sleep(100);
                System.out.println("WithdrownService :"+take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
