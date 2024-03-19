package com.comrade.collection.queue.delay_queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class DelayedClient {
    public static void main(String[] args) {
        BlockingQueue<DelayedWorker> blockingQueue=new DelayQueue<>();
        try {
            blockingQueue.put(new DelayedWorker(1000, "This is message #1"));
            blockingQueue.put(new DelayedWorker(10000, "This is message #2"));
            blockingQueue.put(new DelayedWorker(4000, "This is message #3"));
            blockingQueue.put(new DelayedWorker(408, "This is message #4"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (!blockingQueue.isEmpty()) {
            try {
                System.out.println(blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
